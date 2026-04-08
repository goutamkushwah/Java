import java.util.Scanner; // Importing the Scanner class for user input
public class addition {
  public static void main(String[] args) {
    // Creating a Scanner object
    int sum = add(); // Calling the add method
    System.out.println("The sum is: " + sum); // Printing the result
  }  
  static int add() {
  Scanner sc = new Scanner(System.in);
   int a = sc.nextInt(); // Taking input for a
   int b = sc.nextInt(); // Taking input for b
    return a + b; // Returning the sum of a and b
  }
}
