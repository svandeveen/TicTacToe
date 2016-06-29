import Game.Game;

public class TicTacToe {

	public static void main(String[] args){
		System.out.println("Welcome to TicTacToe");
		Game game = new Game();
		game.setupBoard();
		game.start();
	}
}
