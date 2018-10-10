import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mariah
 *
 */
public class LabFourTableOfPowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		int userInteger; // number chosen by user
		String userContinue; // user's answer to continuing program

		System.out.println("Learn your squares and cubes!");

		do {
			// get user's integer
			System.out.print("Enter an integer:");
			userInteger = userInput.nextInt();

			// create header
			System.out.println("\nNumber\t\tSquared\t\tCubed");
			System.out.println("======\t\t=======\t\t=====");

			// add formulas to find squares and cubes from 1 to value
			for (int i = 1; i <= userInteger; i++) {
				// print out number of iteration
				System.out.print(i + "\t\t");

				int s = i * i; // variable for the i squared, and it's formula
				System.out.print(s + "\t\t");

				int c = i * i * i; // variable for i cubed, and it's formula
				System.out.println(c);
			}

			// create header for multiplication table
			System.out.println("Multiplication Table for " + userInteger + "\t\t");

			// loop for the y variable
			for (int i = 1; i <= userInteger; i++) {
				// loop for the x variable
				for (int z = 1; z <= userInteger; z++) {
					System.out.print(i * z + "\t");
				}
				System.out.println();
			}

			// ask user if they'd like to try a new number
			System.out.print("Continue? (y/n): ");
			userContinue = userInput.next();

		} while (userContinue.equals("y"));

		// when user is done, dismiss them!
		System.out.println("Goodbye!");
		userInput.close();
	}

}
