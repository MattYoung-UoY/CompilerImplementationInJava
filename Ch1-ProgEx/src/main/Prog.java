package main;

import main.types.AssignStm;
import main.types.CompoundStm;
import main.types.EseqExp;
import main.types.IdExp;
import main.types.LastExpList;
import main.types.NumExp;
import main.types.OpExp;
import main.types.PairExpList;
import main.types.PrintStm;
import main.types.Stm;

public class Prog {
	static Stm prog1 = 
			new CompoundStm(new AssignStm("a",new OpExp(new NumExp(5), OpExp.Plus, 
								    new NumExp(3))),
			 new CompoundStm(new AssignStm("b",
			     new EseqExp(new PrintStm(new PairExpList(new IdExp("a"),
			                       new LastExpList(new OpExp(new IdExp("a"), OpExp.Minus,
							  	         new NumExp(1))))),
			             new OpExp(new NumExp(10), OpExp.Times, new IdExp("a")))),
			  new PrintStm(new LastExpList(new IdExp("b")))));
	
	static Stm prog2 =
			new PrintStm(new PairExpList(new EseqExp(new PrintStm(new PairExpList(new NumExp(3), new PairExpList(new NumExp(3), new LastExpList(new NumExp(3))))), new NumExp(3)), new LastExpList(new NumExp(3))));
}