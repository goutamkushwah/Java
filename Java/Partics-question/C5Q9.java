// Date - 06/04/2025
// 9: Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
public class C5Q9 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=8;i<=80;i+=8){
           sum= sum + i;
        }
        System.out.println("Sum of first 10 multiples of 8 is : "+sum); 
    }
}
