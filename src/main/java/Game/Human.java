package Game;

import Field.TicTacToeField;
import Field.XorO;
import utils.GameMemory;
import utils.UserInteraction;

public class Human extends Player {

	public Human(String name, XorO xOrO, boolean starts) {
		super(name, xOrO, starts);
	}

	@Override
	public void doTurn() {
		boolean correctTurn = false;
		do {
			int row = Integer.valueOf(UserInteraction.askUser("Which row do you want to set your " + getxOrO().getXOrO()));
			int column = Integer.valueOf(UserInteraction.askUser("Which column do you want to set your " + getxOrO().getXOrO()));
			TicTacToeField field = GameMemory.getTicTacToeField(row, column);
			if(field != null){
				correctTurn = field.setValue(getxOrO());
			}
			if (!correctTurn){
				System.out.println("This is not possible, try again.");
			}
		} while(!correctTurn); 
	}
}
