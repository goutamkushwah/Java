//Date : 01/06/2025
// Write a program that allows you to given. If max retries exceed 5 print "errors".
import java.lang.Exception;
import java.util.Scanner;
public class C14Q3 {
    public static void main(String[] args) {
    boolean flag = true;
    int [] arr = new int[3];
    arr[0] = 7;
    arr[1] = 56;    
    arr[2] = 6;
Scanner sc = new Scanner(System.in);
int index = 0;
int i=0;
while(flag && i<5) {
    try{
        System.out.println("Enter the value of index");
        index = sc.nextInt();
        System.out.println("The value of arr[index] is " + arr[index]);
        break;
    }
catch (Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }

    }
}