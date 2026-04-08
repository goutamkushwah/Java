import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Taking input for n
       boolean ans = isPrime(n); // Check if the number is prime
        System.out.println(ans);
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // n is divisible by a number other than 1 and itself
            }
        }
        return true; // n is a prime number
    }
}
