package utils;

import java.util.Scanner;

public class UserInteraction {
	private static Scanner scanInput = new Scanner(System.in);
	
	public static String askUser(String question){
		System.out.println(question);
		return scanInput.nextLine();
	}
}
