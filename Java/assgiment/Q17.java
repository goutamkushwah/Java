//Date 16/04/2025
//Write a java program to print perfect number 
/*A perfect number is a positive integer where the sum of its proper divisors 
(divisors excluding the number itself) equals the number itself.
For example, 6 is a perfect number because its proper divisors (1, 2, and 3) add up to 6
 (1+2+3 = 6).   */
import java.util.Scanner;
 public class Q17 {
    public static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it is perfect: ");
        int n = scanner.nextInt();
        System.out.println(isPerfect(n) ? "true" : "false");
        scanner.close();
    }
}
