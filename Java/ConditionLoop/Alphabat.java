import java.util.Scanner;

public class Alphabat {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char ch = sc.next().charAt(0); // Taking input for a character
    if ((ch >= 'a' && ch <= 'z') ) {
        System.out.println(ch + " is Lowercase"); // Check if the character is an alphabet
    } else {
        System.out.println(ch + " is Uppercase"); // If it's not an alphabet
    }
}    
}
