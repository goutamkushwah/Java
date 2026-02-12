//Question 7: Repeat problem 1 using for/while loop.
//* Date - 06/04/2025
// * Question 7: Write a program to print the following pattern using for/while/do while loop.
//  ****       
//  ***
//  **
//  *
public class C5Q7 {
    public static void main(String[] args) {
        //using for loop
        /*for (int i=4;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            */
        //using while loop;
       /*  int i=4;
        while (i>0){
            int j=0;
            while(j<i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }*/
        //using do while loop
        int i=4;
       do{
            int j=0;
            do{
                System.out.print("*");
                j++;
            }while(j<i);
            System.out.println();
            i--;
        
        }while (i>0);
    }
}

