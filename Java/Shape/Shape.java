// Shape.java - Base abstract class for all shapes
abstract class Shape {
    abstract double area();
    abstract double volume();

    void display() {
        System.out.println("Area: " + area());
        System.out.println("Volume: " + volume());
    }
}

