package main;

public class Table {

	String id;
	int value;
	Table tail;
	
	public Table(String id, int value, Table tail) {
		this.id = id;
		this.value = value;
		this.tail = tail;
	}
	
	public int lookup(String target){
		if (id.equals(target)) return value;
		else if(tail == null)
			try {
				throw new Exception("No binding found for identifier: " + target);
			} catch (Exception e) {
				e.printStackTrace();
				System.exit(-1);
				return 0;
			}
		else return tail.lookup(target);
	}
	
	@Override
	public String toString() {
		String tailStr = "";
		if(tail != null) tailStr = ", " + tail.toString();
		return "(" + id + "->" + value + ")" + tailStr;
	}
	
}
