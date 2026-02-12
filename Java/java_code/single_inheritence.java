class Animaal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animaal{
    void barks(){
        System.out.println("Dog barks");
    }
}
public class single_inheritence {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.sound();
        d.barks();
    }
}
