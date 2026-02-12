// Date : 06/04/2025
//Create a simple Rock, Paper  Scissors game in Java. (#Use Conditional Statements)
import java.util.Scanner;
import java.util.Random;
public class Q2 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
        
                // 0 = Rock, 1 = Paper, 2 = Scissors
                String[] choices = {"Rock", "Paper", "Scissors"};
        
                System.out.println("Welcome to Rock, Paper, Scissors!");
        
                while (true) {
                    System.out.print("Enter your choice (rock, paper, scissors or exit): ");
                    String userInput = scanner.nextLine().toLowerCase();
        
                    if (userInput.equals("exit")) {
                        System.out.println("Thanks for playing!");
                        break;
                    }
        
                    int userChoice = -1;
        
                    if (userInput.equals("rock")) userChoice = 0;
                    else if (userInput.equals("paper")) userChoice = 1;
                    else if (userInput.equals("scissors")) userChoice = 2;
                    else {
                        System.out.println("Invalid input! Try again.");
                        continue;
                    }
        
                    int computerChoice = random.nextInt(3);
        
                    System.out.println("Computer chose: " + choices[computerChoice]);
        
                    if (userChoice == computerChoice) {
                        System.out.println("It's a draw!");
                    } else if ((userChoice == 0 && computerChoice == 2) ||
                               (userChoice == 1 && computerChoice == 0) ||
                               (userChoice == 2 && computerChoice == 1)) {
                        System.out.println("You win!");
                    } else {
                        System.out.println("You lose!");
                    }
        
                    System.out.println();
                }
        
                scanner.close();
            }
        }
        
    