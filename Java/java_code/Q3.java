// Date : 18/04/2025
/*
            Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
         */
import java.util.Scanner;
import java.util.Random;

class Game {
    private int number; // Made private for encapsulation
    public int userGuess;
    private int numberOfTries = 0;

    // Getter for numberOfTries
    public int getNoOfTries() {
        return numberOfTries;
    }

    // Setter for numberOfTries
    public void setNoOfTries(int numberOfTries) {
        this.numberOfTries = numberOfTries;
    }

    // Constructor to initialize the random number
    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100) + 1; // Generate a number between 1 and 100
    }

    // Method to take user input
    void takeUserInput() {
        System.out.println("Guess a number between 1 and 100:");
        Scanner sc = new Scanner(System.in);
        userGuess = sc.nextInt();
    }

    // Method to check if the guessed number is correct
    boolean isCorrectNumber() {
        numberOfTries++;
        if (userGuess == number) {
            System.out.println("Correct Guess! You took " + numberOfTries + " tries to guess the number.");
            return true;
        } else if (userGuess < number) {
            System.out.println("Too Low! Try again.");
        } else {
            System.out.println("Too High! Try again.");
        }
        return false;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}