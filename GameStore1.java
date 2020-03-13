/*
 * By: Salman Alessa
 * 
 * Lab 5 parts(1, 2, 3, 4 )
 * 
 * 
 * Github LINK ( https://github.com/MrHooRa/CSC111-LAB05/blob/master/GameStore1.java ).
 * Please if there is a bug or want to contact me, you can contact me at (salman.m.alessa@gmail.com)
 */

import java.util.Scanner;

public class GameStore1 {

	public static void main(String[] args) {
		// Variables 
		int id, numberOfGames;
		double price, total = 0;
		Scanner input = new Scanner(System.in);
			
		//---------------------------------------\\
		
		// Ask user to enter game ID.
		System.out.print("Welcome to Gaming Center :)\nPlease, enter game id: ");
		id = input.nextInt(); 

		// Ask user to enter the price of the game.
		System.out.print("Please, enter the price of a game: ");
		price = input.nextDouble(); 

		// Ask user to enter copies of game.
		System.out.print("Please, enter numbers of game: ");
		numberOfGames = input.nextInt(); 

		// If number of copies are equal 1, Total price will be (Price * Copies).
		if(numberOfGames == 1){
			total = price * numberOfGames;
		
		// If number of copies are more than 1, the program will make 20% discount.
		}else if(numberOfGames >= 1){
			total = (price * numberOfGames) - ((price * numberOfGames) * 0.20);

		// Else, The program will print Error in the screen and exit.
		}else{
			System.out.print("Error");
			System.exit(0);

		}
		
		// Print the total
		System.out.print("Total price for game id: " + id + " is: " + total );
	}

}
