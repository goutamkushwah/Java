//Date - 06/04/2025
/*Question 5: Write a program to find the factorial of a given number using for loops.

Question 6: Repeat problem 5 using a while loop. */
import java.util.Scanner;
public class C5Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int fact=1;
        int i=1;
    while(i<=n){
        fact = fact*i;
        i++;
    }
    System.out.println("Factorial of "+n+" is : "+fact);
    }
}
 
