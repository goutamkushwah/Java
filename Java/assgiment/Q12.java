// Date : 16/04/2025
//Write a java program to accept a string and count total captial and small latters in string
import java.util.Scanner;
public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int capitalCount=0,smallCount=0;
        for (int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)){
                capitalCount++;
            }else if (Character.isLowerCase(ch)){
                smallCount++;
            }
        }
        System.out.println("Total capital letters: " + capitalCount);
        System.out.println("Total small letters: " + smallCount);
        sc.close();
    }
}
       