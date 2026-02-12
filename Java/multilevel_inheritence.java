class Animal {
    void sound(){
        System.out.println("Animal makes sound");       
    }
}
class Dog extends Animal{
        void barks(){
            System.out.println("Dog barks");
        }
    }
    class puppy extends Dog{
        void puppy_barks(){
            System.out.println("Puppy barks");
        }
    }
public class multilevel_inheritence {
    public static void main(String[] args) {
     puppy p = new puppy();
        p.sound();
        p.barks();
        p.puppy_barks();
        Dog d = new Dog();
        d.sound();
        d.barks();
        

    }
}
