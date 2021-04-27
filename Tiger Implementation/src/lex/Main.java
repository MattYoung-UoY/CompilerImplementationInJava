package lex;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import errorMsg.ErrorMsg;
import java_cup.runtime.Scanner;
import java_cup.runtime.Symbol;
import parser.Parser;

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

	private static void parse(String filename) throws IOException{
		ErrorMsg errorMsg = new ErrorMsg(filename);
		BufferedReader inp = new BufferedReader(new FileReader(filename));
		
		Parser parser = new Parser(new Yylex(inp, errorMsg));
		try {
			parser.parse();
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
	
	static String symnames[] = new String[100];
	static {

		symnames[Sym.FUNCTION] = "FUNCTION";
		symnames[Sym.EOF] = "EOF";
		symnames[Sym.INT] = "INT";
		symnames[Sym.GT] = "GT";
		symnames[Sym.DIVIDE] = "DIVIDE";
		symnames[Sym.COLON] = "COLON";
		symnames[Sym.ELSE] = "ELSE";
		symnames[Sym.OR] = "OR";
		symnames[Sym.NIL] = "NIL";
		symnames[Sym.DO] = "DO";
		symnames[Sym.GE] = "GE";
		symnames[Sym.error] = "error";
		symnames[Sym.LT] = "LT";
		symnames[Sym.OF] = "OF";
		symnames[Sym.MINUS] = "MINUS";
		symnames[Sym.ARRAY] = "ARRAY";
		symnames[Sym.TYPE] = "TYPE";
		symnames[Sym.FOR] = "FOR";
		symnames[Sym.TO] = "TO";
		symnames[Sym.TIMES] = "TIMES";
		symnames[Sym.COMMA] = "COMMA";
		symnames[Sym.LE] = "LE";
		symnames[Sym.IN] = "IN";
		symnames[Sym.END] = "END";
		symnames[Sym.ASSIGN] = "ASSIGN";
		symnames[Sym.STRING] = "STRING";
		symnames[Sym.DOT] = "DOT";
		symnames[Sym.LPAREN] = "LPAREN";
		symnames[Sym.RPAREN] = "RPAREN";
		symnames[Sym.IF] = "IF";
		symnames[Sym.SEMICOLON] = "SEMICOLON";
		symnames[Sym.ID] = "ID";
		symnames[Sym.WHILE] = "WHILE";
		symnames[Sym.LBRACK] = "LBRACK";
		symnames[Sym.RBRACK] = "RBRACK";
		symnames[Sym.NEQ] = "NEQ";
		symnames[Sym.VAR] = "VAR";
		symnames[Sym.BREAK] = "BREAK";
		symnames[Sym.AND] = "AND";
		symnames[Sym.PLUS] = "PLUS";
		symnames[Sym.LBRACE] = "LBRACE";
		symnames[Sym.RBRACE] = "RBRACE";
		symnames[Sym.LET] = "LET";
		symnames[Sym.THEN] = "THEN";
		symnames[Sym.EQ] = "EQ";
	}
}
