package lex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import errorMsg.ErrorMsg;
import java_cup.runtime.Symbol;

public class Main {

	public static void main(String argv[]) throws IOException {
		String filename = argv[0];
		ErrorMsg errorMsg = new ErrorMsg(filename);
		BufferedReader inp = new BufferedReader(new FileReader(filename));
		Lexer lexer = new Yylex(inp, errorMsg);
		Symbol tok;

		do {
			tok = lexer.nextToken();
			System.out.print(symnames[tok.sym] + " " + tok.left + ":" + tok.right);
			if(tok.value != null) System.out.print(" " + tok.value);
			System.out.println();
		} while (tok.sym != Sym.EOF);
		
		inp.close();
	}

	static String symnames[] = new String[100];
	static {

		symnames[Sym.EOF] = "EOF";
		symnames[Sym.PRINT] = "PRINT";
		symnames[Sym.INT] = "INT";
		symnames[Sym.COMMA] = "COMMA";
		symnames[Sym.ASSIGN] = "ASSIGN";
		symnames[Sym.LPAREN] = "LPAREN";
		symnames[Sym.RPAREN] = "RPAREN";
		symnames[Sym.SEMICOLON] = "SEMICOLON";
		symnames[Sym.ID] = "ID";
		symnames[Sym.PLUS] = "PLUS";
		symnames[Sym.SUB] = "SUB";
		symnames[Sym.MULT] = "MULT";
		symnames[Sym.DIV] = "DIV";
	}
}
