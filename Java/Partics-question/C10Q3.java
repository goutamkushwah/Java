// Date : 22/04/2025
//Create a method for area and volume in 1 
class Circle{
    public int Radius;
    Circle(int r){
        this.Radius =r;
    }
    public double area() {
        return Math.PI * this.Radius * this.Radius; // Fixed field name
    }
}
class Cilander extends Circle{
public int height;
Cilander(int r, int h){
super(r);
this.height=h;
}
public double volume() {
    return Math.PI * this.Radius * this.Radius * this.height; // Fixed field name
}

}
public class C10Q3 {
    public static void main(String[] args) {
    Cilander obj = new Cilander(12,4);
  System.out.println("Area of Circle: " + obj.area());
  System.out.println("Volume of Cylinder: " + obj.volume());
    }
}
 