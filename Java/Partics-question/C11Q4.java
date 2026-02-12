// Date : 24/04/2025
//Create a class telephone with ( ) , lift ( ) and disconnected ( ) methods
// as abstract methods create another class smart telephone and demonstrate polymorphism 
abstract class telephone {
    abstract void lift();
    abstract void disconnected(); 
}
class smartTelephone extends telephone{
    void lift(){
        System.out.println("Lifting the smart telephone");
    }
    void disconnected(){
        System.out.println("Disconnecting the smart telephone");
    }
}
public class C11Q4 {
 public static void main(String[] args) {
        smartTelephone st = new smartTelephone();
        st.lift();
        st.disconnected();
        //telephone t = new smartTelephone(); // Upcasting
        // t.lift(); // Calls the overridden method in smartTelephone
        // t.disconnected();
 }   
}
