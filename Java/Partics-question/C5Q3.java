//Date 06/04/2025
//Write a program to print the multiplication table of a given number n.
import java.util.Scanner;
public class C5Q3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n = sc.nextInt();
    for(int i=1;i<=10;i++){
        System.out.printf("%d X %d = %d\n", n, i, n*i);
    }
  }  
}
