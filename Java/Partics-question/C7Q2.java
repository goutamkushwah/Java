// Date : 08/04/2025
/*Write a program using functions to print the following pattern:
      *

     **

    ***

   ****
    */
public class C7Q2 {
static void pattern(int n ){
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        System.out.println("Pattern of stars:");
        pattern(n); // Call the method to print the pattern
}
}
