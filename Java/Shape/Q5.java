
public class Q5 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
            new Circle(5),
            new Cylinder(3, 7),
            new Rectangle(4, 6),
            new Square(5),
            new Sphere(3)
        };

        for (Shape shape : shapes) {
            System.out.println("--- " + shape.getClass().getSimpleName() + " ---");
            shape.display();
        }
    }
}
