// Date : 20/04/2025
//Create a class Animal and Derive another class dog from it 
class Animal{
    public void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    public void barks(){
        System.out.println("Dog barks");
    }
}
public class C10Q1 {
    public static void main(String[] args) {
        Dog d =new Dog();
        d.sound();
        d.barks();
    }
}
