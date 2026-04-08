import java.util.Scanner;

public class AramngStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Taking input for n
        boolean ans = isArmstrong(n); // Check if the number is an Armstrong number
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
     int original = n; // Store the original number for comparison
     int sum = 0; // Initialize sum to store the sum of cubes of digits 
     while (n>0) {
        int rem = n%10;
        n=n/10;
        sum = sum + rem*rem*rem; // Add the cube of the digit to the sum
        
     }  
     if (sum == original) {
        return true; // n is an Armstrong number
     } else {
        return false; // n is not an Armstrong number
     }
    }
}
