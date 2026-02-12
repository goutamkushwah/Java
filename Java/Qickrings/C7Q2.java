// Date : 08/04/2025
// /*Write a program to caalculate (recursion must be used ) fibonacci of number in java  */
public class C7Q2 {
    static int fabonacci(int n) { // Changed return type to int
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fabonacci(n - 1) + fabonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 9;
        System.out.println("The value of Fibonacci at position " + n + " is: " + fabonacci(n));
    }
}