// Date : 16/04/2025
// Write a java program for interface
// Interface
interface Animal {
    void sound(); // abstract method
}

// Class implementing interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks.");
    }
}

// Main class
public class Q10_1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

    
