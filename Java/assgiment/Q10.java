// Date : 16/04/2025
// Write a java program for abstract class
// Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Subclass
class Car extends Vehicle {
    // Implement abstract method
    void start() {
        System.out.println("Car is starting...");
    }
}

// Main class
public class Q10 {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}


