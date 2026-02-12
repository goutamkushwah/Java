import java.util.Scanner;
public class exm {
public static void main(String[] args) {
  int fact =1;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find factorial");
    int n = sc.nextInt();
    for(int i=1;i<=n;i++)
    {
        fact *=  i;
    }
    System.out.println("Factorial of " + n + " is: " + fact);     
}
    
}