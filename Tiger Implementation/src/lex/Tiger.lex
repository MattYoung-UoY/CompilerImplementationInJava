package lex;

import java_cup.runtime.Symbol;
import errorMsg.ErrorMsg;
import java.io.BufferedReader;

%% 

%class Yylex
%unicode
%line
%column
%char
%implements Lexer
%function nextToken
%type Symbol

%char

%eofval{
	 return tok(Sym.EOF, null);
%eofval} 

%{
private void newline() {
  errorMsg.newline(yychar);
}

private void err(long pos, String s) {
  errorMsg.error(pos,s);
}

private void err(String s) {
  err(yychar,s);
}

private Symbol tok(int kind, Object value) {
    return new Symbol(kind, yyline, yycolumn, value);
}

private Symbol tok(int kind, int col, Object value){
	return new Symbol(kind, yyline, col, value);
}

private ErrorMsg errorMsg;

Yylex(BufferedReader s, ErrorMsg e) {
  this(s);
  errorMsg=e;
}

String strLit = "";
int strLitCol = 0;

%}  

LineTerminator = \r|\n|\r\n
WhiteSpace = [ \t\f]
IntegerLiteral = [0-9]+
Identifier = [a-z][a-zA-Z0-9_]*

%state STRLIT
%state COMMENT

%%
<YYINITIAL> {
	{LineTerminator}	{newline();}
	{WhiteSpace} {}
	\" {strLit = ""; strLitCol = yycolumn; yybegin(STRLIT);}
	"/*" {yybegin(COMMENT);}
	,	{return tok(Sym.COMMA, null);}
	"function" {return tok(Sym.FUNCTION, null);}
	">" {return tok(Sym.GT, null);}
	"/" {return tok(Sym.DIVIDE, null);}
	":" {return tok(Sym.COLON, null);}
	"else" {return tok(Sym.ELSE, null);}
	"|" {return tok(Sym.OR, null);}
	"nil" {return tok(Sym.NIL, null);}
	"do" {return tok(Sym.DO, null);}
	">=" {return tok(Sym.GE, null);}
	"<" {return tok(Sym.LT, null);}
	"of" {return tok(Sym.OF, null);}
	"-" {return tok(Sym.MINUS, null);}
	"array" {return tok(Sym.ARRAY, null);}
	"type" {return tok(Sym.TYPE, null);}
	"for" {return tok(Sym.FOR, null);}
	"to" {return tok(Sym.TO, null);}
	"*" {return tok(Sym.TIMES, null);}
	"<=" {return tok(Sym.LE, null);}
	"in" {return tok(Sym.IN, null);}
	"end" {return tok(Sym.END, null);}
	":=" {return tok(Sym.ASSIGN, null);}
	"." {return tok(Sym.DOT, null);}
	"(" {return tok(Sym.LPAREN, null);}
	")" {return tok(Sym.RPAREN, null);}
	"if" {return tok(Sym.IF, null);}
	";" {return tok(Sym.SEMICOLON, null);}
	"while" {return tok(Sym.WHILE, null);}
	"[" {return tok(Sym.LBRACK, null);}
	"]" {return tok(Sym.RBRACK, null);}
	"!=" {return tok(Sym.NEQ, null);}
	"var" {return tok(Sym.VAR, null);}
	"break" {return tok(Sym.BREAK, null);}
	"&" {return tok(Sym.AND, null);}
	"+" {return tok(Sym.PLUS, null);}
	"{" {return tok(Sym.LBRACE, null);}
	"}" {return tok(Sym.RBRACE, null);}
	"let" {return tok(Sym.LET, null);}
	"then" {return tok(Sym.THEN, null);}
	"=" {return tok(Sym.EQ, null);}
	{Identifier} {return tok(Sym.ID, yytext());}
	{IntegerLiteral} {return tok(Sym.INT, yytext());}
	[^] {err("Illegal Character");}
}

<STRLIT> {
	\" {yybegin(YYINITIAL); return tok(Sym.STRING, strLitCol, strLit);}
	[^] {strLit += yytext();}
}

<COMMENT> {
	"*/" {yybegin(YYINITIAL);}
	[^] {}
}