// Date 16/03/2025
//  Write a Java program for switch statement. 

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number accroding 1. sunday 2.monday 3. tuesday  4. wednesday 5. Thursday 6. friday 7. saturday ");
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("sunday.");
                break;
            case 2:
                System.out.println("Monday.");
                break;
            case 3:
                System.out.println("Tuesday.");
                break;
            case 4:
                System.out.println("Wednesday.");
                break;
            case 5:
                System.out.println("Thursday.");
                break;
                case 6:
                System.out.println("Friday.");
                break;
                case 7:
                System.out.println("Saturday.");
                break;
            default:
                System.out.println("Invalid number. Please enter a number between 1 and 5.");
                break;
        } 
    }
}
