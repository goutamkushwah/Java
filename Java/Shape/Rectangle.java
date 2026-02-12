
// Rectangle.java
class Rectangle extends Shape {
    protected double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double volume() {
        return 0; // Rectangle is 2D
    }
}
