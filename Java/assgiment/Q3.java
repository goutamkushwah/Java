// Date - 16/03/2025
//  Java program to check whether a given character is alphabet or not.
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char c = sc.next().charAt(0); // Corrected to read a character
        if(Character.isLetter(c)){
            System.out.println(c+" is an alphabat");
        }
        else{
            System.out.println(c+" is not an alphabat");
        }
        sc.close();
    }
}