// Date : 24/04/2025
//Create an abstract class pen with methods write () and refill () as abstract methods 
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
}
public class C11Q1 {
    public static void main(String[] args) {
        fountainPen fp = new fountainPen();
        fp.write();
        fp.refill();
        //pen p = new fountainPen(); // Upcasting
       // p.write(); // Calls the overridden method in fountainPen
       // p.refill();    
    }
    
}
