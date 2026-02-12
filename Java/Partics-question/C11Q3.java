// Date : 24/04/2025
/*Create a class monkey with jump ( ) and bite ( ) methods Create a class human
 whichinherits this monkey class and implements basicanimal interface with eat ( ) 
 and sleep methods  */
class monkey{
  void jump(){
    System.out.println("Jumping...");
  }
  void bite(){
    System.out.println("Biting...");
  }  
}
 interface basicAnimal{
    void eat();
    void sleep();
}
class Human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("Speaking...");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class C11Q3 {
    public static void main(String[] args) {
        Human h = new Human();
        h.jump();
        h.bite();
    }
}
