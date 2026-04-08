
import java.util.Scanner; // Importing the Scanner class to take user input
public class Largest {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // Taking input for a
    int b = sc.nextInt(); // Taking input for b
    int c = sc.nextInt(); // Taking input for c
    int max =a;
    if (b>max) {
        max = b; // Update max if b is greater than current max
    }
    if (c>max) {
        max = c; // Update max if c is greater than current max
    }
    System.out.println("The largest number is: " + max); // Print the largest number
}
}
