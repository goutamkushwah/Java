// 12/03/2025
// Write a program that reads a distance in kilometers, converts it to miles, and prints the result. One kilometer is approximately 0.621371 miles.
import java.util.Scanner;
public class C1Q4 {
    public static void main(String[] args) {
        System.out.println("Enetr Distence in km");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        double miles = km * 0.621371; // Corrected variable type to double
        System.out.println("The distence in miles is : " + miles );
        sc.close();
    }
}
