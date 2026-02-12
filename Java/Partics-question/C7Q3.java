//Date : 08/04/2025
//Write a recursive function to calculate the sum of first n natural numbers.
import java.util.Scanner;
public class C7Q3 {
    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+=sum(n-1);
        }
        
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of n: ");
            int n = sc.nextInt();
            System.out.println("The value of a is: " + sum(n));
       
    }
}
