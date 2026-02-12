//Question 11: Repeat problem 2 using for loop.

import java.util.Scanner;

public class C5Q11 {
    public static void main(String[] args) {
        
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();
        // using for loop
       /* for(int i=0;i<=n;i++){
          
           sum = sum + (2*i);
        }  
         System.err.println("Sum of even numbers is : "+sum);
    } */
    // using while loop
       /* int i=0;
        while(i<=n){
            sum = sum + (2*i);
            i++;
        }  
         System.err.println("Sum of even numbers is : "+sum);
          */
        // using do while loop
        int i=0;
        do{
            sum = sum + (2*i);
            i++;
        }while(i<=n);
            System.err.println("Sum of even numbers is : "+sum);
}
}
