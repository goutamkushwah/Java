// Date : 10/04/2025 
//Create a class cellphone with methods to print “ringing…”, “vibrating…”, etc.
class CellPhone {
    public void Ringing(){
        System.out.println("Ringing....");
    }
    public void Vibrate(){
        System.out.println("Vibrating....");
    }
    public void cllFrind(){
        System.out.println("Calling shivam ... ");
    }
    
}
public class C8Q2 {
  public static void main(String[] args) {
    CellPhone ca = new CellPhone();
    ca.Ringing();
    ca.Vibrate();
    ca.cllFrind();
  }  
}
