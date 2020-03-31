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
Num = [0-9]+
Identifier = [a-z][a-zA-Z0-9_]*

%%
{LineTerminator} {newline();}
{WhiteSpace} {}
"print" {return tok(Sym.PRINT, null);}
":=" {return tok(Sym.ASSIGN, null);}
"+" {return tok(Sym.PLUS, null);}
";" {return tok(Sym.SEMICOLON, null);}
"(" {return tok(Sym.LPAREN, null);}
")" {return tok(Sym.RPAREN, null);}
"," {return tok(Sym.COMMA, null);}
"*" {return tok(Sym.MULT, null);}
"-" {return tok(Sym.SUB, null);}
"//" {return tok(Sym.DIV, null);}
{Identifier} {return tok(Sym.ID, yytext());}
{Num} {return tok(Sym.INT, yytext());}
[^] {err("Illegal Character");}