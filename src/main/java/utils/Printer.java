package utils;

import java.util.List;

import Field.TicTacToeField;
import Game.Player;

public class Printer {
	
	public static void printBoard(){
		List<TicTacToeField> fields = GameMemory.fields;
		System.out.println("   |   |   ");
		System.out.println(fields.get(0).getValue().getXOrO() + "|" + fields.get(1).getValue().getXOrO() + "|" + fields.get(2).getValue().getXOrO());	
		System.out.println("___|___|___");	
		System.out.println("   |   |   ");
		System.out.println(fields.get(3).getValue().getXOrO() + "|" + fields.get(4).getValue().getXOrO() + "|" + fields.get(5).getValue().getXOrO());	
		System.out.println("___|___|___");	
		System.out.println("   |   |   ");
		System.out.println(fields.get(6).getValue().getXOrO() + "|" + fields.get(7).getValue().getXOrO() + "|" + fields.get(8).getValue().getXOrO());
		System.out.println("   |   |   ");
	}
	
	public static void printPlayers(){
		System.out.println("Players: ");	
		List<Player> players = GameMemory.players;
		for(Player player : players){
			System.out.println(player);	
		}
		
	}

}
