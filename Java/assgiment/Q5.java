// Date - 16/03/2025
//Write a Java program to add two binary numbers. 
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first binary number:");
        String binary1 = sc.nextLine();
        System.out.println("Enter second binary number:");
        String binary2 = sc.nextLine();

        // Convert binary numbers to decimal
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);

        // Add the two decimal numbers
        int sum = num1 + num2;

        // Convert the sum back to binary
        String binarySum = Integer.toBinaryString(sum);

        System.out.println("The sum of the two binary numbers is: " + binarySum);
        sc.close();
    }
}