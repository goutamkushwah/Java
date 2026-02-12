import java.util.Scanner;
import java.util.Random;

public class Guess_the_number_game {
    public static void main(String[] args) {
        Random random = new Random(); // Use Random class to generate random numbers
        Scanner scanner = new Scanner(System.in);

        int RandomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
        System.out.println("Debug: The random number is " + RandomNumber); // Debugging line
        int count = 0;
        int n = 0;

        System.out.println("Guess the number (between 1 and 100):");

        while (n != RandomNumber) {
            if (!scanner.hasNextInt()) { // Check if the input is an integer
                System.out.println("Invalid input. Please enter a number between 1 and 100.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            n = scanner.nextInt(); // Take user input

            if (n < 1 || n > 100) { // Validate the range of the input
                System.out.println("Please enter a number between 1 and 100.");
                continue;
            }

            count++;

            if (n > RandomNumber) {
                System.out.println("The number is lower. Try again!");
            } else if (n < RandomNumber) {
                System.out.println("The number is higher. Try again!");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + count + " attempts.");
            }
        }

        scanner.close();
    }
}