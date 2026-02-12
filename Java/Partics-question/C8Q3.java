// Date : 10/04/2025
//Create a class Square with a method to initialize its side, calculating area, perimeter etc.

import java.util.Scanner;

class Square{
    int side;
    public int area(){
     return side*side;
    }
    public int parameter(){
     return 4*side;
    }
}
public class C8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Square square = new Square();
        System.out.println("enter the side : ");
        square.side = sc.nextInt();
        System.out.println("area of square : "+square.area());
        System.out.println("parameter of square : "+square.parameter());
    }
}
