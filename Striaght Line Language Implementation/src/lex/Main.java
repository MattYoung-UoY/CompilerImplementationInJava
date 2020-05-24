package lex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import absyn.AbsynGen;
import errorMsg.ErrorMsg;
import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import parser.Parser;

public class Main {

	public static AbsynGen generator;
	
	public static void main(String argv[]) throws IOException {
		String filename = argv[0];
		
		generator = new AbsynGen();
		
		//lex(filename);
		
		parse(filename);
		
		generator.printAbsyn();
		
	}
	
	private static void parse(String filename) throws IOException{
		ErrorMsg errorMsg = new ErrorMsg(filename);
		BufferedReader inp = new BufferedReader(new FileReader(filename));
		
		Parser parser = new Parser(new Yylex(inp, errorMsg));
		try {
			System.out.println(parser.parse());
		} catch (Exception e) {
			e.printStackTrace();
		}
		inp.close();
	}
	
	private static void lex(String filename) throws IOException{
		ErrorMsg errorMsg = new ErrorMsg(filename);
		BufferedReader inp = new BufferedReader(new FileReader(filename));
		Scanner lexer = new Yylex(inp, errorMsg);
		Symbol tok;

		try {
			do {
				tok = lexer.next_token();
				System.out.print(Sym.terminalNames[tok.sym] + " " + tok.left + ":" + tok.right);
				if (tok.value != null)
					System.out.print(" " + tok.value);
				System.out.println();
			} while (tok.sym != Sym.EOF);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		inp.close();
	}
	
}
