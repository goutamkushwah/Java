// Date : 10/04/2025
/* a class Square with a method to initialize its side, calculating area, perimeter etc.
* Create a class Rectangle & problem 3.
* Create a class TommyVecetti for Rockstar Games capable of hitting (print hitting…), running, firing, etc.
* Repeat problem 4 for a circle.
 */
import java.util.Scanner;

class Circle{
    float Radius;  
    public float area(){
     return (float)(3.14*Radius*Radius);
    }
    //cirgumfrance
    public float parameter(){
     return (float)(2*3.14*Radius);
    }
}
public class C8Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c= new Circle();
         System.out.println("Enter Radius : ");
       c.Radius = sc.nextInt();
       System.out.println("area of circle:"+c.area());
       System.out.println("parameter of circle :"+c.parameter());
     }
 }
 
