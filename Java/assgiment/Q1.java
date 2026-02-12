// Date- 09/03/2025
//Write a Java program to determine maximum from given 100 numbers. 
import java.util.*;
//import java.util.stream.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many numbers you want: ");
        int n= scanner.nextInt();
        System.out.println("Enter the numbers: ");
        int[] num = new int[n]; // Corrected array size to 100
        for (int i = 0; i < n;i++) {
            num[i] = scanner.nextInt();
        }
        int max = Arrays.stream(num).max().orElse(Integer.MIN_VALUE);
        System.out.println("The maximum number is: " + max);
        scanner.close();
    }
}