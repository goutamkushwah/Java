// Date : 08/04/2025
/*Write a function to print the following pattern:
    ****

    ***

    **

    * */

public class C7Q4 {
    static void pattern(int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
public static void main(String[] args) {
   int n =5;
   pattern(n); 
}
}