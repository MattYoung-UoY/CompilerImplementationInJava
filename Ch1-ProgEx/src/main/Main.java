package main;

import main.types.AssignStm;
import main.types.CompoundStm;
import main.types.EseqExp;
import main.types.Exp;
import main.types.ExpList;
import main.types.IdExp;
import main.types.LastExpList;
import main.types.NumExp;
import main.types.OpExp;
import main.types.PairExpList;
import main.types.PrintStm;
import main.types.Stm;

public class Main {
	public static void interp(Stm s) {
		Table terminatingTable = interpStm(s, null);
		System.out.println("\n" + terminatingTable);
		breakLine();
	}
	
	private static Table interpStm(Stm stm, Table table) {
		if (stm instanceof CompoundStm) {
			CompoundStm sp = (CompoundStm) stm;
			Table intermediate = interpStm(sp.stm1, table);
			return interpStm(sp.stm2, intermediate);
		}else if(stm instanceof AssignStm) {
			AssignStm sp = (AssignStm) stm;
			IntAndTable iatInter = interpExp(sp.exp, table);
			return new Table(sp.id, iatInter.i, iatInter.t);
		}else {
			PrintStm sp = (PrintStm) stm;
			ExpList exps = sp.exps;
			return printExps(exps, table);
		}
	}
	
	private static Table printExps(ExpList exps, Table table) {
		if(exps instanceof PairExpList) {
			PairExpList list = (PairExpList) exps;
			IntAndTable iatInter = interpExp(list.head, table);
			System.out.print(iatInter.i + " ");
			return printExps(list.tail, iatInter.t);
		}else {
			LastExpList item = (LastExpList) exps;
			IntAndTable iatInter = interpExp(item.head, table);
			System.out.println(iatInter.i);
			return iatInter.t;
		}
		
	}
	
	private static IntAndTable interpExp(Exp exp, Table table) {
		if(exp instanceof IdExp) {
			IdExp ep = (IdExp) exp;
			return new IntAndTable(table.lookup(ep.id), table);
		}else if(exp instanceof NumExp) {
			NumExp ep = (NumExp) exp;
			return new IntAndTable(ep.num, table);
		}else if(exp instanceof OpExp) {
			OpExp ep = (OpExp) exp;
			IntAndTable iatInter1 = interpExp(ep.left, table);
			IntAndTable iatInter2 = interpExp(ep.right, iatInter1.t);
			int res = 0;
			switch(ep.oper) {
			case OpExp.Plus:
				res = iatInter1.i + iatInter2.i;
				break;
			case OpExp.Minus:
				res = iatInter1.i - iatInter2.i;
				break;
			case OpExp.Times:
				res = iatInter1.i * iatInter2.i;
				break;
			case OpExp.Div:
				res = iatInter1.i / iatInter2.i;
				break;
			}
			return new IntAndTable(res, iatInter2.t);
		}else {
			EseqExp ep = (EseqExp) exp;
			Table inter = interpStm(ep.stm, table);
			return interpExp(ep.exp, inter);
		}
	}

	private static class IntAndTable{
		public int i;
		public Table t;
		
		IntAndTable(int i, Table t){
			this.i = i;
			this.t = t;
		}
	}
	
	static int maxArgsStm(Stm s) {
		if(s instanceof CompoundStm) {
			CompoundStm sp = (CompoundStm) s;
			return Math.max(maxArgsStm(sp.stm1), maxArgsStm(sp.stm2));
		}else if(s instanceof AssignStm){
			AssignStm sp = (AssignStm) s;
			return maxArgsExp(sp.exp);
		}else{
			PrintStm sp = (PrintStm) s;
			return Math.max(expListLength(sp.exps), expListNestedPrint(sp.exps));
			//Nested prints
		}
	}
	
	private static int expListNestedPrint(ExpList exps) {
		if(exps instanceof LastExpList) {return maxArgsExp(((LastExpList) exps).head);}
		else {
			PairExpList pair = (PairExpList) exps;
			return Math.max(maxArgsExp(pair.head), expListNestedPrint(pair.tail));
		}
	}
	
	private static int maxArgsExp(Exp e){
		if(e instanceof IdExp || e instanceof NumExp) {return 0;}
		else if(e instanceof OpExp){
			OpExp ep = (OpExp) e;
			return Math.max(maxArgsExp(ep.left), maxArgsExp(ep.right));
		}else {
			EseqExp ep = (EseqExp) e;
			return Math.max(maxArgsExp(ep.exp), maxArgsStm(ep.stm));
		}
	}
	
	private static int expListLength(ExpList exps) {
		if(exps instanceof LastExpList) {return 1;}
		else {
			PairExpList pair = (PairExpList) exps;
			return expListLength(pair.tail) + 1;
		}
	}

	public static void main(String args[]) throws java.io.IOException {
		System.out.println(maxArgsStm(Prog.prog1));
		System.out.println(maxArgsStm(Prog.prog2));
		breakLine();
		interp(Prog.prog1);
		interp(Prog.prog2);
	}
	
	private static void breakLine() {
		System.out.println("-------------------------------------------");
	}
}
