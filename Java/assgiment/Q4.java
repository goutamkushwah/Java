// Date - 16/03/2025
// Java program to find sum of all digits.

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");
        int number = sc.nextInt();
        int sum=0;
        while(number !=0){
            sum+=number%10;
            number/=10;
        
        }
        System.out.println("The sum of all digits is: " + sum);
        sc.close();
    }
}
