// Date : 08/04/2025
// Program to print Fibonacci series using recursion
public class C7Q3 {
    static int fibonacci(int n) { // Recursive method to calculate Fibonacci
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10; // Number of terms in the Fibonacci series
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}