// Date : 01/06/2025
//  Wrap the program in Q3 inside a method which throws your custom Exception.
import java.util.Scanner;

// Step 1: Define Custom Exception
class MaxRetriesExceededException extends Exception {
    public MaxRetriesExceededException(String message) {
        super(message);
    }
}

public class C14Q5 {

    // Step 2: Method that performs the logic and throws custom exception
    public static void accessArrayElement() throws MaxRetriesExceededException {
        int[] arr = {7, 56, 6};
        Scanner sc = new Scanner(System.in);
        int index;
        int retries = 0;

        while (retries < 5) {
            try {
                System.out.println("Enter the value of index:");
                index = sc.nextInt();
                System.out.println("The value of arr[index] is " + arr[index]);
                return; // exit the method if successful
            } catch (Exception e) {
                System.out.println("Invalid Index or Input. Try again.");
                sc.nextLine(); // Clear input buffer
                retries++;
            }
        }

        // Step 3: If 5 retries are exceeded
        throw new MaxRetriesExceededException("Maximum retries exceeded. Cannot proceed.");
    }

    // Step 4: Main method calling the above logic
    public static void main(String[] args) {
        try {
            accessArrayElement();
        } catch (MaxRetriesExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
