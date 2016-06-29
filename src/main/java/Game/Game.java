package Game;

import java.util.Random;

import Field.TicTacToeField;
import Field.XorO;
import utils.GameMemory;
import utils.Printer;
import utils.UserInteraction;

public class Game {
	public static boolean gameOver;
	public void setupBoard(){
		System.out.println("Just a moment, we're setting up the board...");
		populateFieldsList();
		System.out.println("We initialized " + GameMemory.fields.size() + " fields. The board now looks like this:");
		Printer.printBoard();
		initializePlayers();
		Printer.printPlayers();
	}
	
	public void start(){
		Player winningPlayer = null;
		while(!gameOver && !GameMemory.isDraw()){
			Player player = getPlayerToPlay();
			System.out.println("it is now " + player.getName() +"'s turn");
			player.doTurn();
			Printer.printBoard();
			winningPlayer = GameMemory.checkIfGameOver();
			gameOver = winningPlayer != null;
			changeTurns();
		}
		System.out.println(winningPlayer == null ? "Its a draw" :  winningPlayer.getName() + " is the winner!!");
	}
	
	private void populateFieldsList(){
		for (int i = 1; i<4; i++){
			GameMemory.fields.add(new TicTacToeField(i, 1));
			GameMemory.fields.add(new TicTacToeField(i, 2));
			GameMemory.fields.add(new TicTacToeField(i, 3));
		}
	}
	
	private void initializePlayers(){
		String name = UserInteraction.askUser("What is your name?");
		String xOrOPlayer = UserInteraction.askUser("You want X or O?");
		
		String xOrOComputer = ""; 
		if(xOrOPlayer.equals(XorO.O.getXOrO().trim())){
			xOrOComputer = XorO.X.getXOrO();
		} else if(xOrOPlayer.equals(XorO.X.getXOrO().trim())){
			xOrOComputer = XorO.O.getXOrO();
		} else {
			System.out.println("We don't know what that means, You get O");
			xOrOPlayer = XorO.O.getXOrO();
			xOrOComputer = XorO.X.getXOrO(); 
		}
		boolean playerStarts = whoStarts();
		GameMemory.players.add(new Human(name, XorO.valueOf(xOrOPlayer.trim()), playerStarts));
		GameMemory.players.add(new Computer(XorO.valueOf(xOrOComputer.trim()), !playerStarts));
	}
	
	private boolean whoStarts() {
		Random random = new Random();
	    return random.nextBoolean();
	}
	
	private Player getPlayerToPlay(){
		for (Player player : GameMemory.players){
			if (player.isTurn()){
				return player;
			}
		}
		return null;
	}
	
	private void changeTurns(){
		for (Player player : GameMemory.players){
			player.changeTurn();;
		}
	}
	
}
