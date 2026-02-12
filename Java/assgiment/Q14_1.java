// Date : 16/04/2025
// Write a java program for method overloading and method overriding
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Q14_1 {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Parent class object
        Animal myDog = new Dog();        // Parent reference, child object

        myAnimal.sound();  // Outputs: Animal makes a sound
        myDog.sound();     // Outputs: Dog barks
    }
}