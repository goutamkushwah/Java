// Date: 23/03/2025
//Write a program to print first n odd numbers using a for loop.
import java.util.Scanner;
public class Q8 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    /*
    for( int i=0 ;i<=n;i=i+2){
System.out.println(i);
 }*/
 for (int i =0; i<n; i++){
        System.out.println(2*i+1);
 }
 }   
}
