class Animal{
    void sound(){
        System.out.println("Animal makes sound");       
    }
}
class Dog extends Animal{
        void barks(){
            System.out.println("Dog barks");
        }
}
class Cat extends Animal{
    void meow(){
        System.out.println("Cat meows");
    }
}
public class multipal_inheritence {
    public static void main(String[] args) {
        Dog d =new Dog();
        Cat c = new Cat();
        d.sound();
        d.barks();
        c.sound();
        c.meow();

    }
}
