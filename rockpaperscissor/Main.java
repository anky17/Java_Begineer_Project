package rockpaperscissor;

import java.lang.Math;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice;

		do {
			// Prompt the user to choose an option
			System.out.println(
					"Choose an Option:\n\t\t 1) Rock\n\t\t 2) Paper\n\t\t 3) Scissors\n\nEnter a number(1-3) : ");
			int option = sc.nextInt();

			// Generate a random number representing the computer's choice (1 for Rock, 2
			// for Paper, 3 for Scissors)
			int num = (int) (Math.random() * (3)) + 1; // 1 is added to make 3 inclusive.

			// Determine the winner based on user's choice and computer's choice
			switch (option) {
				case 1:
					System.out.println("\t\tYou choose:- ROCK ");
					if (num == 1)
						System.out.println(
								"\t\tComputer generated option :- ROCK \n\t\t<< !! NO WINNER,IT'S A TIE !!! >>");
					if (num == 2)
						System.out.println(
								"\t\tComputer generated option :- PAPER \n\t\t<< !! COMPUTER HAS WON THE GAME !!! >>");
					if (num == 3)
						System.out.println(
								"\t\tComputer generated option :- SCISSORS \n\t\t<< !! YOU HAVE WON THE GAME !!! >>");
					break;
				case 2:
					System.out.println("\t\tYou choose :- PAPER ");
					if (num == 1)
						System.out.println(
								"\t\tComputer generated option :- ROCK \n\t\t<< !!! YOU HAVE WON THE GAME !!! >>");
					if (num == 2)
						System.out.println(
								"\t\tComputer generated option :- PAPER \n\t\t<< !!! NO WINNER,IT'S A TIE !!! >>");
					if (num == 3)
						System.out.println(
								"\t\tComputer generated option :- SCISSORS \n\t\t<< !!! COMPUTER HAS WON THE GAME !!! >>");
					break;
				case 3:
					System.out.println("\t\tYou choose :- SCISSORS ");
					if (num == 1)
						System.out.println(
								"\t\tComputer generated option :- ROCK \n\t\t<< !!! COMPUTER HAS WON THE GAME !!! >>");
					if (num == 2)
						System.out.println(
								"\t\tComputer generated option :- PAPER \n\t\t<< !!! YOU HAVE WON THE GAME !!! >>");
					if (num == 3)
						System.out.println(
								"\t\tComputer generated option :- SCISSORS \n\t\t<< !!! NO WINNER,IT'S A TIE !!! >>");
					break;
				default:
					System.out.println("\n\t\t********Wrong choice********");
			}

			// Ask the user if they want to play more
			System.out.println("\nWant to play more(y/n) ?");
			choice = sc.next().charAt(0);
		} while (choice == 'y'); // Continue the loop if the user wants to play more
	}
}
