import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Taking input for the number of Fibonacci terms to generate
        int a = 0, b = 1,count =2; // Starting values for the Fibonacci sequence
       while (count<=n) {
int temp = b; // Store the current value of b in a temporary variable
b = a + b; // Update b to the next Fibonacci number
a = temp; // Update a to the previous value of b
count++; // Increment the counter
System.out.print(a + " "); // Print the current Fibonacci number
       }
    }
}
