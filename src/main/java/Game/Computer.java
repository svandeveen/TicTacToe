package Game;

import Field.TicTacToeField;
import Field.XorO;
import utils.GameMemory;

public class Computer extends Player {

	public Computer(XorO xOrO, boolean starts) {
		super("Computer", xOrO, starts);
	}

	@Override
	public void doTurn() {
		TicTacToeField field = GameMemory.getRandomEmptyTicTacToeField();
		field.setValue(getxOrO());
	}

}
