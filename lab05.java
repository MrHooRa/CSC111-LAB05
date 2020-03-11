/*
 * Name: Salman Alessa
 * U ID: 439100011
 * Lab 5 parts(1, 2, 3, 4 )
 * 
 * PLEASE DO NOT REMOVE MY NAME :D
 */

import java.util.Scanner;

public class gamingCenter {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
//		### Just remove comment sign! ###
		
//		GameStore1(); // Lab 5 Part 1
//		GameStore2(); // Lab 5 Part 2
//		GameStore3(0); // Lab 5 Part 3
//		GameStore4(1); // Lab 5 Part 4

	}


	public static void GameStore1() {
		// Vars
		int id, numberOfGames;
		double price, total = 0;

		//---------------------------------------\\
		System.out.print("Welcome to Gaming Center :)\nPlease, enter game id: ");
		id = input.nextInt();

		System.out.print("Please, enter the price of a game: ");
		price = input.nextDouble();

		System.out.print("Please, enter numbers of game: ");
		numberOfGames = input.nextInt();

		if(numberOfGames == 1){
			total = price * numberOfGames;

		}else if(numberOfGames >= 1){
			total = (price * numberOfGames) - ((price * numberOfGames) * 0.20);

		}else{
			System.out.print("Error");

		}

		System.out.print("Total price for game " + id + " is: " + total );
	}


	public static void GameStore2() {
		// Vars
		int id = 0, quantity = 0;
		double price = 0, discount = 0;
		boolean loop = true; //To make while stop when user enter -1


		//---------------------------------------\\
		System.out.print("Welcome to Gaming Center :D\n");

		//To make user add more than 1 game (By using while)
		while(loop == true) {
			System.out.print("Please, enter game id: ");
			id = input.nextInt();

			if(id >= 0) { // If user enter wrong number [ -1 -> End of loop ]
				System.out.print("Please, enter the price of game id " + id + ": ");
				price = price + input.nextDouble();
				quantity++;

			}else{
				loop = false;

			}
		}

		if(quantity > 2) { // If user buy more than 2 copies !
			discount = price * 0.20;

		}
		System.out.print("\nTotal price before discount: " + price + "\nYour discount is: " + discount + "\nYour price after discount: " + (price - discount));

	}

	public static void GameStore3(int inventory) {
		// Vars
		String option;
		int id = 0;
		double discount = 0, price = 0;

		//---------------------------------------\\
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
		
		// When user choose option ADD
		if(option.equals("add")) {
			while(id >= 0) {
				System.out.print("Please, enter game id (-1 to end):");
				id = input.nextInt();
				inventory++;
				
			}
			GameStore3(--inventory);
			
		//When user choose option SELL
		}else if (option.equals("sell")) {
			// When inventory is NOT empty
			if(inventory > 0) {
				int i = inventory;
				while(inventory > 0) {
					System.out.print("Please, enter game id (-1 to end): ");
					id = input.nextInt();
					System.out.print("Please, enter the price of next game: ");
					price = price + input.nextDouble();
					inventory--;
					
				}
				if(i > 2) { // If user buy more than 2 copies !
					discount = price * 0.20;
					
				}
				System.out.print("\nTotal price before discount: " + price + "\nYour discount is: " + discount + "\nYour price after discount: " + (price - discount));
				GameStore3(0);
				
			}else{
				System.out.print("Sorry. There are no more games in store :(");
				GameStore3(0);
				
			}
		}else if (option.equals("exit")) {
			System.out.print("Thanks. Goodbye!");
			System.exit(0);
			
		}
	}
	
	public static void GameStore4(int start) {
		// Vars
		double total = 0, price = 0;
		int copies;
		String type, stop;

		if(start == 1) {
			System.out.print("Welcome to Gaming Center :D\n");
			
		}
		System.out.print("Please, enter the type of the game: ");
		type = input.next();
		System.out.print("Please, enter the price of a game: ");
		price = input.nextDouble();
		System.out.print("Please, enter number of copies: ");
		copies = input.nextInt();

		if(type.equals("g")) {
			total = (price * copies) + ((price * copies) * 0.40);
			
			if(copies > 2) {
				total = total - ((price * copies) * 0.20); 

			}

		}else if(type.equals("n")) {
			total = price * copies;
			if(copies > 3) {
				total = total - ((price * copies) * 0.10); 

			}

		}else {
			System.out.print("Error");
			GameStore4(1);
			
		}

		System.out.print("Total price is: " + total);
		System.out.print("\nDo you want to continue? yes or no: ");
		stop = input.next();
		if(stop.equals("no")) {
			System.exit(0);
			
		}else if(stop.equals("yes")) {
			GameStore4(0);
			
		}

	}

}
