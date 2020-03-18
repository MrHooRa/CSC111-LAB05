/*
 * By: Salman Alessa
 * 
 * Lab 5 parts(1, 2, 3, 4 )
 * 
 * 
 * Github LINK ( https://github.com/MrHooRa/CSC111-LAB05/blob/master/GameStore3.java ).
 * Please if there is a bug or want to contact me, you can contact me at (salman.m.alessa@gmail.com).
 * 
 * We will use methods in this part.
 */

import java.util.Scanner;

public class GameStore4 {

	public static void main(String[] args) {

		// Call class GameStore with variable start = 1 ( That's mean, when program start ).
		GameStore(1);

	}

	public static void GameStore(int start) {
		// Variables
		double total = 0, price = 0;
		int copies;
		String type, stop;
		Scanner input = new Scanner(System.in);

		// If the variable start = 1 ( First time ) , do ....
		if(start == 1) {
			System.out.print("Welcome to Gaming Center :D\n");

		}

		// Ask user to enter game type.
		System.out.print("Please, enter the type of the game: ");
		type = input.next();

		// Ask user to enter price of the game.
		System.out.print("Please, enter the price of a game: ");
		price = input.nextDouble();

		// Ask user to enter number of copies of game.
		System.out.print("Please, enter number of copies: ");
		copies = input.nextInt();

		// If user entered game type g.
		if(type.equals("g")) {
			total = (price * (copies - 1)) * 1.40;

			// If copies are more than 2.
			if(copies > 2) {
				total = total - (total * 0.20) + (price * 1.40);

			}

		// Else , if user entered game type n.
		}else if(type.equals("n")) {
			total = price * (copies - 2);

			// If user entered copies more than 3.
			if(copies > 3) {
				total = total - (total * 0.10) + ( price * 2 ); 

			}

		// Neither, call class GameStore with variable start = 1. 
		}else {
			System.out.print("Error");
			GameStore(0);

		}

		// Print Total and ask user if want to continue or not.
		System.out.print("Total price is: " + total);
		System.out.print("\nDo you want to continue? yes or no: ");
		stop = input.next();

		// If no, exit.
		if(stop.equals("no")) {
			System.exit(0);

		// If continue, call class GameStore with variable start = 0.
		}else if(stop.equals("yes")) {
			GameStore(0);

		}

	}

}
