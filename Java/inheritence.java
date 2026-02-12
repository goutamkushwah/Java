class Base{
public int x;
public int getX(){
    return x;
}
public void setX(int x){
    System.out.println("I am in base and setting X now");
    this.x=x;
}
public void printme(){
    System.out.println("I am a constructor");
}
}
class Derived extends Base{
    public int y;
    public int gety(){
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
public class inheritence {
public static void main(String[] args) {
    // Creating an object of base class
    Base b = new Base();
    b.setX(4);
    System.out.println(b.getX());
    // Creating an object of derived class
    Derived d = new Derived();
    d.sety(43);
    System.out.println(d.gety());
}    
}