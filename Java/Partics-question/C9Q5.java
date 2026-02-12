// Date : 18/04/2025
//Repeat ➊ for a sphere
class sphere{
    private int radius;
    public sphere(int radius){
        this.radius = radius;
    }
    public int get_redius(){
        return radius;
    }
    public void set_radius(int radius){
        this.radius = radius;
    }
    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
    public double volume(){
        return (4.0/3) * Math.PI * radius * radius * radius;
    }

}
public class C9Q5 {
    public static void main(String[] args) {
        sphere s = new sphere(5); // Corrected class name
        System.out.println("Radius: " + s.get_redius());
        s.set_radius(7);
        System.out.println("Updated Radius: " + s.get_redius());
        System.out.println("Surface Area: " + s.surfaceArea());
        System.out.println("Volume: " + s.volume());
    }
}
