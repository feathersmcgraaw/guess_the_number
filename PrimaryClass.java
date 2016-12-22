package wmccormack.guess.the.number;

import java.util.Scanner;
import java.util.Random;

/**
 * Guess The Number is a simple game utilising a single class
 * 
 * @author wmccormack
 *
 */
public class PrimaryClass {

	public static Scanner myScanner = new Scanner(System.in);

	public PrimaryClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Main method will be used to invoke methods
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		rootMenu();
		userOptions();

	}

	public static void rootMenu() {

		System.out.println("-------------------------");
		System.out.println("  ---------------------  ");
		System.out.println("    -----------------    ");
		System.out.println("    GUESS THE NUMBER!    ");
		System.out.println("    -----------------    ");
		System.out.println("  ---------------------  ");
		System.out.println("-------------------------");
		System.out.println();
		System.out.println("         1. play        ");
		System.out.println("     2. instructions    ");
		System.out.println("         3. exit        ");

	}

	public static void userOptions() {

		int userChoice;

		System.out.println();
		System.out.println("     select an option...");
		userChoice = myScanner.nextInt();

		switch (userChoice) {
		case 1:
			playGame();
			break;
		case 2:
			instructions();
			break;
		case 3:
			System.out.println("thanks for playing!");
			myScanner.close();
			break;
		default:

		}

	}

	public static void playGame() {
		int userGuess;
		int attempts;
		attempts = 0;
		Random randomNumber = new Random();
		int myRandomNumber = randomNumber.nextInt(10);
		myRandomNumber++;
		System.out.println();
		System.out.println("guess a number between 1 and 10");

		do {

			attempts++;

			userGuess = myScanner.nextInt();

			if (attempts == 4) {
				System.out.println("too many attempts. you lose!");
				System.out.println("the number was " + myRandomNumber);
			} else if (userGuess == myRandomNumber) {
				System.out.println("correct!");
			} else if ((userGuess++ == myRandomNumber) || (userGuess-- == myRandomNumber)) {
				System.out.println("close... try again");
			} else if (attempts == 3) {
				System.out.println("you lose!");
				System.out.println("the number was " + myRandomNumber);
			} else
				System.out.println("try again");

		} while (userGuess != myRandomNumber);

	}

	public static void instructions() {
		int instructionsChoice;

		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("guess the number is really simple");
		System.out.println("just guess what number I am thinking of");
		System.out.println("i will tell you when are getting closer");
		System.out.println("but you only have 3 guesses");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		System.out.println();
		System.out.println();
		System.out.println("         1. play        ");
		System.out.println("         2. exit        ");
		instructionsChoice = myScanner.nextInt();

		switch (instructionsChoice) {
		case 1:
			playGame();
			break;
		case 2:
			System.out.println("exiting ...");
			break;
		default:
			System.out.println("didn't catch that. try again");
			userOptions();
		}

	}
}
