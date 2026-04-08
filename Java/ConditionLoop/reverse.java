public class reverse {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10; // Get the last digit
            rev = rev * 10 + rem; // Append the last digit to the reversed number
            num = num / 10; // Remove the last digit from the original number
        }
        System.out.println("Reversed number: " + rev);
    }
}
