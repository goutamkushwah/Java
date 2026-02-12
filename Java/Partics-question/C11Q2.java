//Date : 24/04/2025
//Use the pen class from Q1 to create a concrete class fountain pen with additional method change Nib ()
abstract class pen {
    abstract void write();
    abstract void refill(); 
}
class fountainPen extends pen{
    void write(){
        System.out.println("Writing with a fountain pen");
    }
    void refill(){
        System.out.println("Refilling the fountain pen");
    }
    void changeNib(){
        System.out.println("Changing nib of the fountain pen");
    }
}
public class C11Q2 {
    public static void main(String[] args) {
        fountainPen fp = new fountainPen();
        fp.write();
        fp.refill();
        fp.changeNib(); // Calling the new method in fountainPen
        //pen p = new fountainPen(); // Upcasting
       // p.write(); // Calls the overridden method in fountainPen
       // p.refill();    
    }
}