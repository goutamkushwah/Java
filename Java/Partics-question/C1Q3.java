// Date: 2021/09/18
// Write a java program which asks the user to enter his/her name and grets them with
// "Hello<name>have a good day 

import java.util.Scanner;

public class C1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Hello "+name+" have a good day" );
    }
}
