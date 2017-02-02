package wmccormack.guess.the.number;

import java.util.Scanner;
import java.util.Random;

/**
 * Guess The Number is a simple game utilising a single class.
 * 
 * @author wmccormack
 *
 */
public class PrimaryClass {

	public static Scanner myScanner = new Scanner(System.in);
	public static int GUESS_RANGE = 10;

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
			playGame(GUESS_RANGE);
			break;
		case 2:
			instructions();
			break;
		case 3:
			System.out.println("thanks for playing!");
			myScanner.close();
			break;
		default:
			System.out.println("I didn't understand that choice.. try again");
			userOptions();
		}

	}

	public static void playGame(int GUESS_RANGE) {
		int userGuess;
		int attempts;
		int loop;
		loop = 0;
		Random randomNumber = new Random();
		int myRandomNumber = randomNumber.nextInt(GUESS_RANGE);
		myRandomNumber++;
		System.out.println();
		System.out.println("how many guesses would you like?");
		attempts = myScanner.nextInt();
		System.out.println("ok cool. guess a number between 1 and " + GUESS_RANGE);

		do {
			loop++;

			userGuess = myScanner.nextInt();

			if (userGuess == myRandomNumber) {
				System.out.println("correct!");
			} else if ((userGuess++ == myRandomNumber) || (userGuess-- == myRandomNumber)) {
				System.out.println("close... try again");
			} else if (loop == attempts) {
				System.out.println("you lose!");
				System.out.println("the number was " + myRandomNumber);
			} else
				System.out.println("try again");

		} while (userGuess != myRandomNumber);

	}

	public static void instructions() {
		int instructionsChoice;

		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("guess the number is really simple");
		System.out.println("just guess what number I am thinking of");
		System.out.println("i will tell you when are getting closer");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println("---------------------------------------");
		System.out.println();
		System.out.println();
		System.out.println("         1. play        ");
		System.out.println("         2. exit        ");
		instructionsChoice = myScanner.nextInt();

		switch (instructionsChoice) {
		case 1:
			playGame(GUESS_RANGE);
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
