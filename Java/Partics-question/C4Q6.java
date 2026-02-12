//Date - 18/03/2025
/*:Write a program to find out the type of website from the URL:

.com – commercial website
.org – organization website
.in – Indian website */
import java.util.Scanner;
public class C4Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter website: ");
        String website = sc.nextLine();
        if(website.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("Organisation website");
        }
        else if(website.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Invalid website");
        }
    }
}
