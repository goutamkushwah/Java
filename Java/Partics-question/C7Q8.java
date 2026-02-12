// Date : 08/04/2025
//Repeat problem 2 using Recursion.
/*Write a program using functions to print the following pattern:
      *

     **

    ***

   ****
 */
public class C7Q8 {
    static void pattern(int n, int current) {
        if (current > n) { // Base case: stop when current exceeds n
            return;
        }
        for (int i = 0; i < current; i++) { // Print 'current' number of stars
            System.out.print("* ");
        }
        System.out.println();
        pattern(n, current + 1); // Recursive call with incremented current
    }

    public static void main(String[] args) {
        int n = 4; // Number of rows
        System.out.println("The pattern is: ");
        pattern(n, 1); // Start with 1 star
    }
}