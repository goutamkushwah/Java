// DATE - 13/03/2025
/*use comarison operators to find out weather a given number is greater than the user enterd
 number or not */

import java.util.Scanner;


public class C2Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println(a>5);
        sc.close();
    }
}
