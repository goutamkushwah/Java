//Date : 16/04/2025
// Write a java program to convert a decimal number to binary number

import java.util.Scanner;
public class Q7 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number to convert to binary: ");
    int decimalNumber = sc.nextInt(); 
    String binaryNumber = Integer.toBinaryString(decimalNumber); // Convert to binary string
    System.out.println("Decimal Number: " + decimalNumber); 
    System.out.println("Binary Number: " + binaryNumber); 
}
}