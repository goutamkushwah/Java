//Date : 25/04/2025
//Use a build-in package in java to write a class which displays a message ( by using sout ) after taking input from the user 
import java.util.Scanner;
public class C12Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a message : ");
        String message = sc.nextLine();
        System.out.println("You entered: " + message);
        sc.close(); // Close the scanner to prevent resource leaks
    }
}
