package Field;

public enum XorO {
	X(" X "), O(" O "), EMPTY("   ");
	 
	private String xOrO;
 
	private XorO(String s) {
		xOrO = s;
	}
 
	public String getXOrO() {
		return xOrO;
	}

}
