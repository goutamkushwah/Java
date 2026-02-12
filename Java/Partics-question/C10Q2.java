// Date : 22/04/2025
//Create a class rectangle and use inheritance to create another class cuboid, try to keep
// it as close to the real-world scenario as possible 
class Rectangle{
    private int length;
    private int breadth;
    Rectangle(int l , int b){
        this.length = l;
        this.breadth = b;
    }
    public int getLength(){
        return length;
    }
    int getBreadth(){
        return breadth;
    }
    public int Area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    private int height;
    Cuboid(int length,int breadth,int height){
        super(length, breadth);
        this.height=height;
    }
    public int getHeight(){
     return height;   
    }
    public int volume(){
        return Area()*height;
    }
}
public class C10Q2 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(10,5 );
        System.out.println("Area of Rectangle : "+r.Area());
    Cuboid c = new Cuboid(10, 5, 8);
    System.out.println("Area of Rectangle (Base of Cuboid): " + c.Area());
        System.out.println("Volume of Cuboid: " + c.volume());
    }

}
