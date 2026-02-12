 // Date  : 10/04/2025
//Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void Run(){
        System.out.println("Running from the enemy");
    }
    public void Fire(){
        System.out.println("Firing on the enemy");
    }
}
public class C8Q5 {
 public static void main(String[] args) {
    Tommy play = new Tommy();
    play.Fire();
    play.Run();
    play.hit();
 }   
}
