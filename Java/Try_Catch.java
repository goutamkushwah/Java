import java.lang.Exception;
public class Try_Catch {
    public static void main(String[] args) {
        int a = 6000;
        int b = 0;

        // Using try-catch to handle division by zero
        try {
            int c = a / b;  // This will throw ArithmeticException
            System.out.println("The result is " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }

        // This line will still execute even if an exception occurs
        System.out.println("End of the program");
    }
}
