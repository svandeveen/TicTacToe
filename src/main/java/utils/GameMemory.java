package utils;

import java.util.ArrayList;
import java.util.List;

import Field.TicTacToeField;
import Field.XorO;
import Game.Player;

public class GameMemory {
	public static List<TicTacToeField> fields = new ArrayList<>();
	public static List<Player> players = new ArrayList<>();
	
	public static TicTacToeField getTicTacToeField(int row, int column){
		for (TicTacToeField field : fields){
			if (field.getColumn() == column && field.getRow() == row){
				return field;
			}
		}
		return null;
	}
	
	public static TicTacToeField getRandomEmptyTicTacToeField(){
		for (TicTacToeField field : fields){
			if (field.getValue() == XorO.EMPTY){
				return field;
			}
		}
		return null;
	}
	
	public static Player checkIfGameOver(){
		Player player = null;
		if(fields.get(0).getValue() != XorO.EMPTY && fields.get(0).getValue() == fields.get(1).getValue() && fields.get(0).getValue() == fields.get(2).getValue()){
			player =  getPlayerByXorO(fields.get(1).getValue()) ;
		} else if (fields.get(3).getValue() != XorO.EMPTY && fields.get(3).getValue() == fields.get(4).getValue() && fields.get(3).getValue() == fields.get(5).getValue()){
			player =  getPlayerByXorO(fields.get(3).getValue()) ;
		} else if (fields.get(6).getValue() != XorO.EMPTY && fields.get(6).getValue() == fields.get(7).getValue() && fields.get(6).getValue() == fields.get(8).getValue()){
			player =  getPlayerByXorO(fields.get(6).getValue()) ;
		} else if (fields.get(0).getValue() != XorO.EMPTY && fields.get(0).getValue() == fields.get(3).getValue() && fields.get(0).getValue() == fields.get(6).getValue()){
			player =  getPlayerByXorO(fields.get(0).getValue()) ;
		} else if (fields.get(1).getValue() != XorO.EMPTY && fields.get(1).getValue() == fields.get(4).getValue() && fields.get(1).getValue() == fields.get(7).getValue()){
			player =  getPlayerByXorO(fields.get(1).getValue()) ;
		} else if (fields.get(2).getValue() != XorO.EMPTY && fields.get(2).getValue() == fields.get(5).getValue() && fields.get(2).getValue() == fields.get(8).getValue()){
			player =  getPlayerByXorO(fields.get(2).getValue()) ;
		} else if (fields.get(0).getValue() != XorO.EMPTY && fields.get(0).getValue() == fields.get(4).getValue() && fields.get(0).getValue() == fields.get(8).getValue()){
			player =  getPlayerByXorO(fields.get(0).getValue()) ;
		} else if (fields.get(6).getValue() != XorO.EMPTY && fields.get(6).getValue() == fields.get(4).getValue() && fields.get(6).getValue() == fields.get(2).getValue()){
			player =  getPlayerByXorO(fields.get(6).getValue()) ;
		}
		return player;
	}
	
	private static Player getPlayerByXorO(XorO xOrO){
		for (Player player : players){
			if (player.getxOrO() == xOrO){
				return player;
			}
		}
		return null;
	}
	
	public static boolean isDraw(){
		//implement logic to check if game is a draw
		return false;
	}
}
