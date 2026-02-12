// Date : 20/04/2025
//Create a class circle and use inheritance to create another class cylinder from it
class Circle {
    public int Radius;

    Circle() {
        System.out.println("I am a non-parameterized constructor of Circle");
    }

    Circle(int r) {
        System.out.println("I am a parameterized constructor of Circle");
        this.Radius = r;
    }

    public double area() {
        return Math.PI * this.Radius * this.Radius; // Fixed field name
    }
}

class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r); // Call the parameterized constructor of Circle
        System.out.println("I am a parameterized constructor of Cylinder");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.Radius * this.Radius * this.height; // Fixed field name
    }
}

public class C10Q1 {
    public static void main(String[] args) {
        // Create a Cylinder object
        Cylinder obj = new Cylinder(12, 4);
        System.out.println("Area of Circle: " + obj.area());
        System.out.println("Volume of Cylinder: " + obj.volume());
    }
}