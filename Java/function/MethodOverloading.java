public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cal = new Calculator(); // Create an object
        
        System.out.println(cal.sum(4, 5));       // Calls int, int
        System.out.println(cal.sum(4, 5, 6));    // Calls int, int, int
        System.out.println(cal.sum(4.5, 5.5));   // Calls double, double
    }
}

class Calculator {
    // Overload 1: Two integers
    int sum(int a, int b) {
        return a + b;
    }

    // Overload 2: Three integers
    int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Overload 3: Two doubles
    double sum(double a, double b) {
        return a + b;
    }
}