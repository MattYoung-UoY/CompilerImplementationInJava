package errorMsg;

public class ErrorMsg {
	
	private LineList linePos = new LineList(-1, null);
	private int lineNum = 1;
	private String filename;
	public boolean anyErrors;

	public ErrorMsg(String f) {
		filename = f;
	}

	public void newline(long pos) {
		lineNum++;
		linePos = new LineList(pos, linePos);
	}

	public void error(long pos, String msg) {
		int n = lineNum;
		LineList p = linePos;
		String sayPos = "0.0";

		anyErrors = true;

		while (p != null) {
			if (p.head < pos) {
				sayPos = ":" + String.valueOf(n) + "." + String.valueOf(pos - p.head - 1);
				break;
			}
			p = p.tail;
			n--;
		}

		System.out.println(filename + sayPos + ": " + msg);
	}
}

class LineList {
	long head;
	LineList tail;

	LineList(long h, LineList t) {
		head = h;
		tail = t;
	}
}