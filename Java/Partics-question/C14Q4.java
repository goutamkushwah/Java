
// Date : 01/06/2025
// Modify program in Q3 to throw a custom Exception if max retries are reached.
import java.util.Scanner;

// Custom Exception class
class MaxRetriesExceededException extends Exception {
    public MaxRetriesExceededException(String message) {
        super(message);
    }
}

public class C14Q4 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] arr = new int[3];
        arr[0] = 7;
        arr[1] = 56;
        arr[2] = 6;

        Scanner sc = new Scanner(System.in);
        int index = 0;
        int i = 0;

        while (flag && i < 5) {
            try {
                System.out.println("Enter the value of index:");
                index = sc.nextInt();
                System.out.println("The value of arr[index] is " + arr[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid Index");
                sc.nextLine(); // Clear invalid input
                i++;
            }
        }

        try {
            if (i >= 5) {
                throw new MaxRetriesExceededException("Maximum retries exceeded. Error.");
            }
        } catch (MaxRetriesExceededException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
