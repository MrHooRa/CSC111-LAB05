/*
 * By: Salman Alessa
 * 
 * Lab 5 parts(1, 2, 3, 4 )
 * 
 * 
 * Github LINK ( https://github.com/MrHooRa/CSC111-LAB05 ).
 * Please if there is a bug or want to contact me, you can contact me at (salman.m.alessa@gmail.com)
 */

import java.util.Scanner;

public class GameStore2 {

	public static void main(String[] args) {
		// Variables
		int id = 0, quantity = 0;
		double price = 0, discount = 0;
		boolean loop = true;	//To make while stop when user enter -1
		Scanner input = new Scanner(System.in);

		//---------------------------------------\\
		System.out.print("Welcome to Gaming Center :D\n");

		// To make user add more than 1 game we will use while
		// While user enter number more than 0, do ....
		while(loop == true) {
			
			// Ask the user to enter game id.
			System.out.print("Please, enter game id: ");
			id = input.nextInt();
			
			// If the user enter ( -1 ) -> End of loop ( loop == false ).
			if(id >= 0) { 
				
				// Ask the user to enter price of the game.
				System.out.print("Please, enter the price of game id " + id + ": ");
				price = price + input.nextDouble();
				
				// Add +1 to know how many copies do the user entered.
				quantity++;
						
			// If the user entered ( -1 ) -> End of loop.
			}else{
				loop = false;
						
			}
		}

		// If the user bought more than two copies!
		if(quantity > 2) { 
			discount = price * 0.20;

		}

		// Print Total.
		System.out.print("\nTotal price before discount: " + price + "\nYour discount is: " + discount + "\nYour price after discount: " + (price - discount));
		
	}

}
