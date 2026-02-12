//Date : 18/04/2025
//create a class cylinder and use getter and setters to set its radius and height
// Q3 include
 
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
}

public class C9Q1 {
    public static void main(String[] args) {
        Cylinder c = new Cylinder(5, 10); // Corrected class name
        System.out.println("Radius: " + c.get_radius());
        System.out.println("Height: " + c.get_height());

        c.set_radius(7);
        c.set_height(14);

        System.out.println("Updated Radius: " + c.get_radius());
        System.out.println("Updated Height: " + c.get_height());
    }
}