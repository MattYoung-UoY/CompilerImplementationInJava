// DO NOT EDIT
// Generated by JFlex 1.8.1 http://jflex.de/
// source: E:/Files/Programming/Java Projects/CompilerImplementationInJava/Tiger Implementation/src/Parse/Tiger.lex

package Parse;

import java_cup.runtime.Symbol;
import ErrorMsg.ErrorMsg;
import java.io.BufferedReader;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Yylex implements Lexer {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\u10ff\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\0\1\1\1\3\22\0\1\1"+
    "\1\4\4\0\1\5\1\0\1\6\1\7\1\10\1\11"+
    "\1\12\1\13\1\14\1\15\12\16\1\17\1\20\1\21"+
    "\1\22\1\23\2\0\32\24\1\25\1\0\1\26\1\0"+
    "\1\24\1\0\1\27\1\30\1\31\1\32\1\33\1\34"+
    "\1\35\1\36\1\37\1\35\1\40\1\41\1\35\1\42"+
    "\1\43\1\44\1\35\1\45\1\46\1\47\1\50\1\51"+
    "\1\52\1\35\1\53\1\35\1\54\1\55\1\56\u0182\0";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[512];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\0\1\3\1\4\1\5\1\6"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\15\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\2\24\1\34\4\24"+
    "\1\35\1\36\2\24\1\37\1\24\1\40\6\24\1\41"+
    "\1\42\1\24\1\43\1\44\2\24\1\45\3\24\1\46"+
    "\1\24\1\47\1\50\1\24\1\51\1\52\1\24\1\53"+
    "\2\24\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\57\0\57\0\136\0\215\0\57\0\57\0\57"+
    "\0\57\0\57\0\57\0\57\0\57\0\57\0\274\0\353"+
    "\0\57\0\u011a\0\57\0\u0149\0\57\0\57\0\u0178\0\u01a7"+
    "\0\u01d6\0\u0205\0\u0234\0\u0263\0\u0292\0\u02c1\0\u02f0\0\u031f"+
    "\0\u034e\0\u037d\0\u03ac\0\57\0\57\0\57\0\57\0\57"+
    "\0\57\0\57\0\u03db\0\u040a\0\u01d6\0\u0439\0\u0468\0\u0497"+
    "\0\u04c6\0\u01d6\0\u01d6\0\u04f5\0\u0524\0\u01d6\0\u0553\0\u01d6"+
    "\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e\0\u066d\0\u01d6\0\u01d6"+
    "\0\u069c\0\u01d6\0\u01d6\0\u06cb\0\u06fa\0\u01d6\0\u0729\0\u0758"+
    "\0\u0787\0\u01d6\0\u07b6\0\u01d6\0\u01d6\0\u07e5\0\u01d6\0\u01d6"+
    "\0\u0814\0\u01d6\0\u0843\0\u0872\0\u01d6";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\0\1\2\1\3\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\1\24\1\0\1\25\1\26\1\27"+
    "\1\30\1\31\1\32\1\33\1\34\2\31\1\35\1\31"+
    "\1\36\1\37\1\40\3\31\1\41\1\31\1\42\1\43"+
    "\1\31\1\44\1\45\1\46\61\0\1\3\76\0\1\47"+
    "\52\0\1\17\62\0\1\50\56\0\1\51\56\0\1\52"+
    "\52\0\1\31\5\0\1\31\2\0\16\31\1\53\6\31"+
    "\21\0\1\31\5\0\1\31\2\0\16\31\1\54\6\31"+
    "\21\0\1\31\5\0\1\31\2\0\25\31\21\0\1\31"+
    "\5\0\1\31\2\0\14\31\1\55\10\31\21\0\1\31"+
    "\5\0\1\31\2\0\12\31\1\56\1\57\11\31\21\0"+
    "\1\31\5\0\1\31\2\0\14\31\1\60\4\31\1\61"+
    "\3\31\21\0\1\31\5\0\1\31\2\0\5\31\1\62"+
    "\5\31\1\63\11\31\21\0\1\31\5\0\1\31\2\0"+
    "\4\31\1\64\20\31\21\0\1\31\5\0\1\31\2\0"+
    "\10\31\1\65\14\31\21\0\1\31\5\0\1\31\2\0"+
    "\5\31\1\66\17\31\21\0\1\31\5\0\1\31\2\0"+
    "\7\31\1\67\4\31\1\70\7\31\1\71\21\0\1\31"+
    "\5\0\1\31\2\0\1\72\24\31\21\0\1\31\5\0"+
    "\1\31\2\0\7\31\1\73\15\31\21\0\1\31\5\0"+
    "\1\31\2\0\16\31\1\74\6\31\21\0\1\31\5\0"+
    "\1\31\2\0\4\31\1\75\20\31\21\0\1\31\5\0"+
    "\1\31\2\0\17\31\1\76\5\31\21\0\1\31\5\0"+
    "\1\31\2\0\3\31\1\77\21\31\21\0\1\31\5\0"+
    "\1\31\2\0\16\31\1\100\6\31\21\0\1\31\5\0"+
    "\1\31\2\0\13\31\1\101\11\31\21\0\1\31\5\0"+
    "\1\31\2\0\20\31\1\102\4\31\21\0\1\31\5\0"+
    "\1\31\2\0\12\31\1\103\12\31\21\0\1\31\5\0"+
    "\1\31\2\0\4\31\1\104\20\31\21\0\1\31\5\0"+
    "\1\31\2\0\15\31\1\105\7\31\21\0\1\31\5\0"+
    "\1\31\2\0\16\31\1\106\6\31\21\0\1\31\5\0"+
    "\1\31\2\0\10\31\1\107\14\31\21\0\1\31\5\0"+
    "\1\31\2\0\1\110\24\31\21\0\1\31\5\0\1\31"+
    "\2\0\1\111\24\31\21\0\1\31\5\0\1\31\2\0"+
    "\4\31\1\112\20\31\21\0\1\31\5\0\1\31\2\0"+
    "\2\31\1\113\22\31\21\0\1\31\5\0\1\31\2\0"+
    "\13\31\1\114\11\31\21\0\1\31\5\0\1\31\2\0"+
    "\4\31\1\115\20\31\21\0\1\31\5\0\1\31\2\0"+
    "\12\31\1\116\12\31\21\0\1\31\5\0\1\31\2\0"+
    "\24\31\1\117\21\0\1\31\5\0\1\31\2\0\11\31"+
    "\1\120\13\31\21\0\1\31\5\0\1\31\2\0\20\31"+
    "\1\121\4\31\21\0\1\31\5\0\1\31\2\0\4\31"+
    "\1\122\20\31\21\0\1\31\5\0\1\31\2\0\10\31"+
    "\1\123\14\31\21\0\1\31\5\0\1\31\2\0\14\31"+
    "\1\124\10\31\21\0\1\31\5\0\1\31\2\0\13\31"+
    "\1\125\11\31\3\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2209];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\1\1\1\0\11\11\2\1\1\11\1\1"+
    "\1\11\1\1\2\11\15\1\7\11\53\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[85];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
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

private ErrorMsg errorMsg;

Yylex(BufferedReader s, ErrorMsg e) {
  this(s);
  errorMsg=e;
}



  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Symbol nextToken() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          { 	 return tok(sym.EOF, null);
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { 
            }
            // fall through
          case 45: break;
          case 2:
            { newline();
            }
            // fall through
          case 46: break;
          case 3:
            { return tok(sym.AND, null);
            }
            // fall through
          case 47: break;
          case 4:
            { return tok(sym.LPAREN, null);
            }
            // fall through
          case 48: break;
          case 5:
            { return tok(sym.RPAREN, null);
            }
            // fall through
          case 49: break;
          case 6:
            { return tok(sym.TIMES, null);
            }
            // fall through
          case 50: break;
          case 7:
            { return tok(sym.PLUS, null);
            }
            // fall through
          case 51: break;
          case 8:
            { return tok(sym.COMMA, null);
            }
            // fall through
          case 52: break;
          case 9:
            { return tok(sym.MINUS, null);
            }
            // fall through
          case 53: break;
          case 10:
            { return tok(sym.DOT, null);
            }
            // fall through
          case 54: break;
          case 11:
            { return tok(sym.DIVIDE, null);
            }
            // fall through
          case 55: break;
          case 12:
            { return tok(sym.INT, yytext());
            }
            // fall through
          case 56: break;
          case 13:
            { return tok(sym.COLON, null);
            }
            // fall through
          case 57: break;
          case 14:
            { return tok(sym.SEMICOLON, null);
            }
            // fall through
          case 58: break;
          case 15:
            { return tok(sym.LT, null);
            }
            // fall through
          case 59: break;
          case 16:
            { return tok(sym.EQ, null);
            }
            // fall through
          case 60: break;
          case 17:
            { return tok(sym.GT, null);
            }
            // fall through
          case 61: break;
          case 18:
            { return tok(sym.LBRACK, null);
            }
            // fall through
          case 62: break;
          case 19:
            { return tok(sym.RBRACK, null);
            }
            // fall through
          case 63: break;
          case 20:
            { return tok(sym.ID, yytext());
            }
            // fall through
          case 64: break;
          case 21:
            { return tok(sym.LBRACE, null);
            }
            // fall through
          case 65: break;
          case 22:
            { return tok(sym.OR, null);
            }
            // fall through
          case 66: break;
          case 23:
            { return tok(sym.RBRACE, null);
            }
            // fall through
          case 67: break;
          case 24:
            { return tok(sym.NEQ, null);
            }
            // fall through
          case 68: break;
          case 25:
            { return tok(sym.ASSIGN, null);
            }
            // fall through
          case 69: break;
          case 26:
            { return tok(sym.LE, null);
            }
            // fall through
          case 70: break;
          case 27:
            { return tok(sym.GE, null);
            }
            // fall through
          case 71: break;
          case 28:
            { return tok(sym.DO, null);
            }
            // fall through
          case 72: break;
          case 29:
            { return tok(sym.IF, null);
            }
            // fall through
          case 73: break;
          case 30:
            { return tok(sym.IN, null);
            }
            // fall through
          case 74: break;
          case 31:
            { return tok(sym.OF, null);
            }
            // fall through
          case 75: break;
          case 32:
            { return tok(sym.TO, null);
            }
            // fall through
          case 76: break;
          case 33:
            { return tok(sym.END, null);
            }
            // fall through
          case 77: break;
          case 34:
            { return tok(sym.FOR, null);
            }
            // fall through
          case 78: break;
          case 35:
            { return tok(sym.LET, null);
            }
            // fall through
          case 79: break;
          case 36:
            { return tok(sym.NIL, null);
            }
            // fall through
          case 80: break;
          case 37:
            { return tok(sym.VAR, null);
            }
            // fall through
          case 81: break;
          case 38:
            { return tok(sym.ELSE, null);
            }
            // fall through
          case 82: break;
          case 39:
            { return tok(sym.THEN, null);
            }
            // fall through
          case 83: break;
          case 40:
            { return tok(sym.TYPE, null);
            }
            // fall through
          case 84: break;
          case 41:
            { return tok(sym.ARRAY, null);
            }
            // fall through
          case 85: break;
          case 42:
            { return tok(sym.BREAK, null);
            }
            // fall through
          case 86: break;
          case 43:
            { return tok(sym.WHILE, null);
            }
            // fall through
          case 87: break;
          case 44:
            { return tok(sym.FUNCTION, null);
            }
            // fall through
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}