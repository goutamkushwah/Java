
// Circle.java
class Circle extends Shape {
    protected double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double volume() {
        return 0; // Circle is 2D
    }
}
