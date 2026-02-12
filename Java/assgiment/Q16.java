//Date 16/04/2025
//write a java program using while loop do while loop for loop
public class Q16 {
    public static void main(String[] args) {
        // using for loop
        System.out.println("Using for loop:");
        for(int i = 1; i <= 10; i++) {
            System.out.println( i);
        }
         System.out.println("Using while loop:");
        // using while loop
        int j=1;
        while(j<=10){
            System.out.println(j);
            j++;
        }
        // using do while loop
        System.out.println("Using do while loop:");
        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k <= 10);
    }
}
