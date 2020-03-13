/*
 * By: Salman Alessa
 * 
 * Lab 5 parts(1, 2, 3, 4 )
 * 
 * 
 * Github LINK ( https://github.com/MrHooRa/CSC111-LAB05 ).
 * Please if there is a bug or want to contact me, you can contact me at (salman.m.alessa@gmail.com).
 */

import java.util.Scanner;

public class gamingCenter {
	
	// You can use static *DataType* *Name* = ........ , as Scanner input = new Scanner(System.in);
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//	### Just remove comment sign! ###
		
		//	GameStore1(); // Lab 5 Part 1
		//	GameStore2(); // Lab 5 Part 2
		//	GameStore3(0); // Lab 5 Part 3
			GameStore4(1); // Lab 5 Part 4

	}


	public static void GameStore1() {
		// Variables 
		int id, numberOfGames;
		double price, total = 0;
				
		//---------------------------------------\\
				
		// Ask the user to enter game ID.
		System.out.print("Welcome to Gaming Center :)\nPlease, enter game id: ");
		id = input.nextInt(); 

		// Ask the user to enter the price of the game.
		System.out.print("Please, enter the price of a game: ");
		price = input.nextDouble(); 

		// Ask the user to enter number of copies of game.
		System.out.print("Please, enter number of copies of game: ");
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


	public static void GameStore2() {
		// Variables
		int id = 0, quantity = 0;
		double price = 0, discount = 0;
		boolean loop = true;	//To make while stop when user enter -1

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

	public static void GameStore3(int inventory) {
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
							
				// Add +1 to know how many games do the user entered.
				inventory++;
							
			}
						
		// After user enter -1, call class GameStore again with inventory value = 1 - inventory.
		GameStore3(--inventory);
								
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
				GameStore3(0);
									
			}else{
							
				// Print empty, call GameStore with 0 in inventory.
				System.out.print("Sorry. There are no more games in store :(");
				GameStore3(0);
									
			}
						
		// If user choose option EXIT, print Thanks, Goodbye!, exit.
		}else if (option.equals("exit")) {
			System.out.print("Thanks. Goodbye!");
			System.exit(0);
		}
	}
	
	public static void GameStore4(int start) {
		// Variables
		double total = 0, price = 0;
		int copies;
		String type, stop;

		// If the variable start = 1 ( First time ) , do ....
		if(start == 1) {
			System.out.print("Welcome to Gaming Center :D\n");
			
		}
		
		// Ask the user to enter game type.
		System.out.print("Please, enter the type of the game: ");
		type = input.next();
		
		// Ask the user to enter price of the game.
		System.out.print("Please, enter the price of a game: ");
		price = input.nextDouble();
	
		// Ask the user to enter number of copies of game.
		System.out.print("Please, enter number of copies: ");
		copies = input.nextInt();

		// If the user entered game type g.
		if(type.equals("g")) {
			total = (price * copies) + ((price * copies) * 0.40);
			
			// If the copies are more than 2.
			if(copies > 2) {
				total = total - ((price * copies) * 0.20); 

			}

		// Else , if the user entered game type n.
		}else if(type.equals("n")) {
			total = price * copies;
			
			// If the user entered copies more than 3.
			if(copies > 3) {
				total = total - ((price * copies) * 0.10); 

			}

		// Neither, call class GameStore with variable start = 1. 
		}else {
			System.out.print("Error");
			GameStore4(0);
			
		}

		// Print Total and ask the user if want to continue or not.
		System.out.print("Total price is: " + total);
		System.out.print("\nDo you want to continue? yes or no: ");
		stop = input.next();
		
		// If no, exit.
		if(stop.equals("no")) {
			System.out.print("Thanks, GoodBey! :D");
			System.exit(0);
			
		// If continue, call class GameStore with variable start = 0.
		}else if(stop.equals("yes")) {
			GameStore4(0);
			
		}

	}

}
