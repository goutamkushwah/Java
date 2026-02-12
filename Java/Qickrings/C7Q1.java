// Date : 08/04/2025
/*Write a program to caalculate (recursion must be used ) factorial of number in java  */
public class C7Q1 {
    static int factorial(int n){
        if(n==0 ||n==1){
            return 1;
        }
else{
    return n*factorial(n-1);
}
    }
    public static void main(String[] args) {
        System.out.println("The value of factorial x is: " + factorial(5));
    }
}
