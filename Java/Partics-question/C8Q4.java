// Date : 10/04/2025
// 3. Create a class Square with a method to initialize its side, calculating area, perimeter etc.
//Create a class Rectangle & problem 3.

import java.util.Scanner;

class Rectangle{
    int length;
    int widdht;   
    public int area(){
     return length*widdht;
    }
    public int parameter(){
     return 2*(length+widdht);
    }
}

public class C8Q4 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        Rectangle rec = new Rectangle();
        System.out.println("Enter length : ");
      rec.length = sc.nextInt();
      System.out.println("Enter Width : ");
      rec.widdht = sc.nextInt();
      System.out.println("area of rectangle:"+rec.area());
      System.out.println("parameter of rectangle :"+rec.parameter());
    }
}

