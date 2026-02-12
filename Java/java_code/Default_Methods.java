interface Animal{
    // Default method
    default void say(){
        System.out.println("Hello, this is default method");
    }
    // Abstract method
    void bark();
}
public class Default_Methods implements Animal{

    @Override
    public void bark() {
        System.out.println("Dog barks!");
    }
    public static void main(String[] args) {
        Default_Methods obj1 = new Default_Methods();
        obj1.bark();
        obj1.say();

    }


}