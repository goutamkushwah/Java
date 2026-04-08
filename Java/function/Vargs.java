import java.util.Arrays; // Importing the Arrays class to use the toString method
public class Vargs {
    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5); // Calling the method with variable number of arguments 
    }
    static void fun(int... v) { // This method can take variable number of integer arguments
    System.out.println(Arrays.toString(v)); // Print the number of arguments passed
    }
    }
