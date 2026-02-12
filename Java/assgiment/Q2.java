// Date 16/03/2025
// Write a Java program to calculate the factorial of a given numbers. 
import java.util.*;
public class Q2 {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in); 
System.out.println("Enter a number: "); 
int num = sc.nextInt();
int fact=1;   
for(int i=1;i<=num;i++){
    fact=fact*i;
}
System.out.println("The factorial of given no is :"+fact);
} 
}