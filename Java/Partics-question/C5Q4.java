// Date - 06/04/2025
//Question 4: Write a program to print a multiplication table of 10 in reverse order.
public class C5Q4 {
      public static void main(String[] args) {
        
        int n = 10;
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n", n, i, n*i);
        }
      }  
    }