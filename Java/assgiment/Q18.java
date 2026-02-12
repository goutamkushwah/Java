//Date : 16/04/2025
//Write a java progtam to check wheather number is armstrong or not
/*An Armstrong number is a special number that equals the sum of its digits each raised
 to the power of the number of digits. For example, 153 is an Armstrong number because 
 1^3 + 5^3 + 3^3 = 153.  */

import java.util.Scanner;

public class Q18 {
    
    // Function to calculate x raised 
    // to the power y 
    static int power(int x, long y)
    {
        if (y == 0)
            return 1;
        if (y % 2 == 0)
            return power(x, y / 2) * power(x, y / 2);
        return x * power(x, y / 2) * power(x, y / 2);
    }

    // Function to calculate order of the number 
    static int order(int x)
    {
        int n = 0;
        while (x != 0) {
            n++;
            x = x / 10;
        }
        return n;
    }

    // Function to check whether the given 
    // number is Armstrong number or not
    static boolean isArmstrong(int x)
    {
        // Calling order function
        int n = order(x);
        int temp = x, sum = 0;
        while (temp != 0) {
            int r = temp % 10;
            sum = sum + power(r, n);
            temp = temp / 10;
        }

        // If satisfies Armstrong condition
        return (sum == x);
    }

    // Driver Code
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if it is an Armstrong number: ");
        int x = sc.nextInt();
        if (isArmstrong(x)){
            System.out.println(x + " is an Armstrong number.");
            }
        else{
            System.out.println(x + " is not an Armstrong number.");
            }
    }
}