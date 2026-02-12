// Date - 18/03/2025
//Write a Java program to find whether a year entered by the user is a leap year or not.

import java.util.Scanner;

public class C4Q5 {
    public static void main(String[] args) {
  /*      Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("This is a leap year");
        }
        else{
            System.out.println("This is not a leap year");
        }
 */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
    