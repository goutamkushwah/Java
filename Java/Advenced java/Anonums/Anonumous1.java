@FunctionalInterface
interface Animal{
    void bark();
}

class Dog implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
}

public class Anonumous1{
    public static void main(String[] args) {
        Dog Bruno = new Dog();
        Bruno.bark();
          }
}