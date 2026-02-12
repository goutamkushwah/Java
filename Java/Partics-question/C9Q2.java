// Date : 18/04/2025
//use ➊ to calculate surface and volume of the cylinder 
class Cylinder {
    private int radius;
    private int height;

    // Parameterized constructor
    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    // Getter for radius
    public int get_radius() {
        return radius;
    }

    // Setter for radius
    public void set_radius(int radius) { // Changed return type to void
        this.radius = radius;
    }

    // Getter for height
    public int get_height() {
        return height;
    }

    // Setter for height
    public void set_height(int height) { // Changed return type to void
        this.height = height;
    }

public double surfaceArea(){
    return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
}
public double volume(){
    return Math.PI * radius * radius * height;
}
}
public class C9Q2 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(5, 10); // Corrected class name
        System.out.println("Radius: " + c.get_radius());
        System.out.println("Height: " + c.get_height());

        c.set_radius(7);
        c.set_height(14);

        System.out.println("Updated Radius: " + c.get_radius());
        System.out.println("Updated Height: " + c.get_height());
        System.out.println("Surface Area: " + c.surfaceArea());
        System.out.println("Volume: " + c.volume());
    }
}
