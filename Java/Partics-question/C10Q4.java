//Date : 22/04/2025
//create methods for area & volume in 2 also create getters and setters 
class Rectangle {
private int length;
private int breadth;
Rectangle (int l ,int b){
    this.length =l;
    this.breadth=b;
    }
    public void setLength(int l){
        this.length =l;
    }
    public int getLength(){
        return length;
    }
    public  void setBreadth(int b) {
        this.breadth = b;
    }
        public int getBreadth(){
        return breadth;
    }
    public int Area(){
        return length*breadth;
    }
}
class Cuboid extends Rectangle{
    private int height;
    Cuboid(int l,int b,int h){
        super(l, b);
        this.height=h;
    }
    public void setheight(int h){
        this.height=h;
    }
    public int getHeight(){
        return height;
    }
    public int volume(){
        return Area()*height;
    }
}
public class C10Q4 {
   public static void main(String[] args) {
    Rectangle r = new Rectangle(10, 4);
    System.out.println("Area of Rectangle: " + r.Area());

    // Create a Cuboid object
    Cuboid c = new Cuboid(10, 4, 5);
    System.out.println("Area of Rectangle (Base of Cuboid): " + c.Area());
    System.out.println("Volume of Cuboid: " + c.volume());
    c.setBreadth(40);
    c.setLength(20);
    c.setheight(30);
    System.out.println(c.getBreadth());
    System.out.println(c.getLength());
    System.out.println(c.getHeight());
   } 
}

