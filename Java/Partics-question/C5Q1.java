// Date: 26/03/2025
/*  Write a program to print the following pattern :
****

***

**

*
*/
public class C5Q1 {
    public static void main(String[] args) {
        for (int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
