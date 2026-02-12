// Date : 26/03/2025
// Write a program to sum first n even numbers using a while loop.
import java.util.Scanner;
public class C5Q2 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        for(int i=0;i<=n;i++){
          
           sum = sum + (2*i);
        }  
         System.err.println("Sum of even numbers is : "+sum);
    }
    
}
