public class occurenceCount {
    public static void main(String[] args) {
        int n = 43535;
        int count = 0;
        while (n > 0) {
            int rem = n % 10; // Get the last digit of n
            if (rem == 5) { // Check if the last digit is 5
                count++; // Increment the count if it is 5
            }
            n = n / 10; // Remove the last digit from n
        }
        System.out.println("The number of occurrences of 5 is: " + count);

    }
}
