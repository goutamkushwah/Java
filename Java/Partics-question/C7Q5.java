// Date : 08/04/2025
//Write a function to print the nth term of the Fibonacci series using recursion.
public class C7Q5 {
    static int fabonacci(int n){
        if(n==1||n==2){
            return n-1;
        }
        else{
            return fabonacci(n-1)+fabonacci(n-2);
        }
    }
    public static void main(String[] args) {
        int n=7;
       System.out.println( fabonacci(n));
    }
}
