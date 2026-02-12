// Date : 16/04/2025
//Write a java program for method overloading and method overriding  
class Merhod_overloading{
    public int  add(int a,int b){
        return a+b;
    }
    public int add(int a,int b ,int c){
        return a+b+c;
    }
    double add(double a, double b) {
        return a + b;
    }
}
public class Q14 {
    public static void main(String[] args) {
        Merhod_overloading m = new Merhod_overloading();
        System.out.println(m.add(10,20));
        System.out.println(m.add(10,20,30));
        System.out.println(m.add(10.5,20.5));
    }
}
