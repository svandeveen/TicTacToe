package Game;

import Field.XorO;

public abstract class Player {
	private final XorO xOrO; 
	private final String name;
	private boolean turn;
	
	public Player(String name, XorO xOrO, boolean turn){
		this.xOrO = xOrO;
		this.name = name;
		this.turn = turn;
	}
	
	public abstract void doTurn();

	public String getName() {
		return name;
	}

	public XorO getxOrO() {
		return xOrO;
	}
	
	@Override
	public String toString(){
		String kind = (this instanceof Computer) ? "Computer" : "Human";
		String startsYesNo = turn ? "Yes" : "No";
		return "Name: " + name + ", Plays with : " + xOrO.getXOrO() + ", Kind: " + kind + " Starts: " + startsYesNo;
	}

	public boolean isTurn() {
		return turn;
	}
	
	public void changeTurn(){
		this.turn = !this.turn;
	}

}
