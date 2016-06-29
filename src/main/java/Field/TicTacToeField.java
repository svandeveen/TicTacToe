package Field;

public class TicTacToeField {
	private final int row;
	private final int column;
	private XorO value = XorO.EMPTY;
	
	public TicTacToeField(int row, int column){
		this.row = row;
		this.column = column;
	}
	
	public int getRow() {
		return row;
	}

	public int getColumn() {
		return column;
	}

	public XorO getValue() {
		return value;
	}
	public boolean setValue(XorO value) {
		if(this.value == XorO.EMPTY){
			this.value = value;
			return true;
		} 
		return false;
	}
	
}
