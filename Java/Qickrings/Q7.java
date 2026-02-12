//Date 25/03/2025
//Write a program to print first n natural numbers using a do-while loop.
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i=1;
        do{
            System.out.println(i);
            i++;
        }
        while(i<=n);
    }
}
