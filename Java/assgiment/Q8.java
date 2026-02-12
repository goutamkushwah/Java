// Date : 16/04/2025
// Write a java program for parameterized constructor
class Sum {
    int a;
    int b;

    // Parameterized constructor
    Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to calculate the sum
    public int calculateSum() {
        return a + b;
    }
}

public class Q8 {
    public static void main(String[] args) {
        // Create an object using the parameterized constructor
        Sum s = new Sum(5, 10);
        int result = s.calculateSum();
        System.out.println("The sum of 5 and 10 is: " + result);
    }
}