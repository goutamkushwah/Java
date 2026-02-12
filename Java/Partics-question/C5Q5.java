//Date - 06/04/2025
//Question 5: Write a program to find the factorial of a given number using for loops.
import java.util.Scanner;
public class C5Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int fact=1;
    for(int i=1;i<=n;i++){
        fact = fact*i;
    }
    System.out.println("Factorial of "+n+" is : "+fact);
    }
}
