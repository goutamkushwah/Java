//Date : 08/04/2025
//Write a Java method to print the multiplication table of a number n.

import java.util.Scanner;

public class C7Q1 {
    static void multiplication_table(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number to print its multiplication table: ");
            int n =sc.nextInt() ; // Number for which multiplication table is to be printed
            System.out.println("Multiplication table of " + n + ":");
            multiplication_table(n); // Call the method to print the multiplication table
       
    }
}
