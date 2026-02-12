// Date : 08/04/2025
//Repeat problem 4 using Recursion.
/*Write a function to print the following pattern:
    ****

    ***

    **

    *
     */
public class C7Q7 {
   static void pattern(int n){
   if(n==0){
    return ;
   }
    for(int i=0;i<n;i++){
        System.out.print("* ");
    }
    System.out.println();
    pattern(n-1);
   }
    public static void main(String[] args) {
        int n=4;
        System.out.println("The pattern is: ");
        pattern(n);

    }
}
