package parser;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import errorMsg.ErrorMsg;
import lex.Yylex;

public class Parse {

	public ErrorMsg errorMsg;

	public Parse(String filename) {
		errorMsg = new ErrorMsg(filename);
		BufferedReader inp;
		try {
			inp = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			throw new Error("File not found: " + filename);
		}
		Grm parser = new Grm(new Yylex(inp, errorMsg), errorMsg);

		try {
			parser./* debug_ */parse();
		} catch (Throwable e) {
			e.printStackTrace();
			throw new Error(e.toString());
		} finally {
			try {
				inp.close();
			} catch (java.io.IOException e) {
			}
		}
	}
}
