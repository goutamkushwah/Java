// Cylinder.java
class Cylinder extends Circle {
    private double height;

    Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}
