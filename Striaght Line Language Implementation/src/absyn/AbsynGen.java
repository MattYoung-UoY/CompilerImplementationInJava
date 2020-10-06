package absyn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EmptyStackException;
import java.util.Stack;

import java_cup.runtime.Symbol;
import lex.Sym;

public class AbsynGen {
	
	private int expListCounter;
	
	private Stack<Node> genStack;
	
	public AbsynGen() {
		genStack = new Stack<Node>();
		expListCounter = 0;
	}
	
	public void stackSymbol(int TokID, Object value) {
		if(TokID != -1) genStack.push(new Node(new Symbol(TokID, value)));
		else genStack.push(new Node(null));
	}

	public void addNode(int TokID, Object value, int nodesToCons) {
		ArrayList<Node> children = new ArrayList<Node>();
		for(int i = 0; i < nodesToCons; i++) children.add(genStack.pop());
		Collections.reverse(children);
		if(TokID != -1) genStack.push(new Node(new Symbol(TokID, value), children));
		else genStack.push(new Node(null, children));
	}
	
	public String getAbsyn() {
		return genStack.peek().toString();
	}
	
	public Node getAbsynTree() {
		return genStack.peek();
	}
	
	public void incrementCounter() {
		expListCounter++;
	}
	
	public int getCounter() {
		int res = expListCounter;
		expListCounter = 0;
		return res;
	}
	
	private class Node{
		
		private Symbol token;
		private ArrayList<Node> children;
		
		public Node(Symbol token) {
			this.token = token;
			children = null;
		}
		
		public Node(Symbol token, ArrayList<AbsynGen.Node> children) {
			this.token = token;
			this.children = children;
		}
		
		@Override
		public String toString() {
			String res = "";
			if(token == null) res += "stm/expSeq"; else res += Sym.terminalNames[token.sym];

			if(token != null && token.value != null)  res += "(" + token.value + ")";
			if(children != null) {
				res += "(";
				for(int i = 0; i < children.size(); i++) {
					res += children.get(i);
					if(i != children.size() - 1) res += ", ";
				}
				res += ")";
			};
			return res;
		}
		
	}
	
}
