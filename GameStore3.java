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

public class GameStore3 {

	public static void main(String[] args) {

		// Call class Game Store 3, make the inventory value = 0. (Because it is empty).
		GameStore(0);

	}

	public static void GameStore(int inventory) {
		// Variables
		String option;
		int id = 0;
		double discount = 0, price = 0;
		Scanner input = new Scanner(System.in);

		//---------------------------------------\\
		// Print welcome message and ask the user to enter the option.
		System.out.print("\n*************************************************************************\n" +
				"*\t\t\t Welcome to Gaming Center :D\t\t\t*\n" + 
				"*\t\t\t--------------------------- \t\t\t*\n" +
				"*\tPlease enter one of the following options: \t\t\t*\n" + 
				"*\t1) add  ==> this allows you to add a game to inventory\t\t*\n" +
				"*\t2) sell ==> this allows you to sell games to a customer\t\t*\n" + 
				"*\t3) exit ==> to end this program\t\t\t\t\t*\n" + 
				"*\t\t\t\t\t\t\t\t\t*\n*************************************************************************\n" +
				"\nEnter your options :> ");
		option = input.next();

		// When the user choose option ADD.
		if(option.equals("add")) {

			// While the user enter number more than -1, do ....
			while(id >= 0) {

				// Ask the user to enter game id.
				System.out.print("Please, enter game id (-1 to end):");
				id = input.nextInt();
				
				// if user enter -1, exit from this while!
				if(id == -1) {
					break;
				}
				// Add +1 to know how many games do the user entered.
				inventory++;

			}

		// After user enter -1, call class GameStore again with inventory value = inventory.
		GameStore(inventory);

		//When the user choose option SELL.
		}else if (option.equals("sell")) {

			// When inventory is NOT empty.
			if(inventory > 0) {

				// New variable i = inventory.
				int i = inventory;

				// While inventory are not empty.
				while(inventory > 0) {

					// Ask the user to enter game id.
					System.out.print("Please, enter game id (-1 to end): ");
					id = input.nextInt();

					// Ask the user to enter price of the game.
					System.out.print("Please, enter the price of next game: ");
					price = price + input.nextDouble();
						
					// Reduce inventory by one.
					inventory--;
								
				}
					
				// If user buy more than 2 games, Make 20% discount.
				if(i > 2) { 
					discount = price * 0.20;
								
				}
				
				// Print Total, call GameStore with 0 in inventory.
				System.out.print("\nTotal price before discount: " + price + "\nYour discount is: " + discount + "\nYour price after discount: " + (price - discount));
				GameStore(0);
							
			}else{
					
				// Print empty, call GameStore with 0 in inventory.
				System.out.print("Sorry. There are no more games in store :(");
				GameStore(0);
							
			}
				
		// If user choose option EXIT, print Thanks, Goodbye!, exit.
		}else if (option.equals("exit")) {
			System.out.print("Thanks. Goodbye!");
			System.exit(0);
		}
	}
}
