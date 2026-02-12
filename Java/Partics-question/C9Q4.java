// Date : 18/04/2025
//Overload a constructor used to initialize a rectangle of length and breath 5 for using custom parameters 
class Rectangle {
    private int length;
    private int width;
    public Rectangle() {
        this.length = 4;
        this.width = 5;
    }
    // Parameterized constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Getter for length
    public int get_length() {
        return length;
    }
    // Getter for width
    public int get_width() {
        return width;
    }
}

public class C9Q4 {
    public static void main(String[] args) {
        Rectangle c = new Rectangle(); // Corrected class name
        System.out.println("length: " + c.get_length());
        System.out.println("width: " + c.get_width());
        Rectangle c1 = new Rectangle(10, 20); // Corrected class name
        System.out.println("Updated length: " + c1.get_length());
        System.out.println("Updated width: " + c1.get_width());
    }
}