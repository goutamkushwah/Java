public class Swapping {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swapping using a temporary variable
        int temp = a; // Store the value of a in temp
        a = b;       // Assign the value of b to a
        b = temp;    // Assign the value of temp (original a) to b
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
