class math{
    public int add(int a, int b){
        return a + b;
    }
    public double add(double a, double b){
        return a + b;
    }
    public String add(String a, String b){
        return a + b;
    }   
    public int add(int a, int b, int c){
        return a + b + c;
    }
}
public class polymorphism {
    public static void main(String[] args) {
        math m = new math();
        System.out.println(m.add(5, 6)); // int + int
        System.out.println(m.add(5.0, 6.0)); // double + double
        System.out.println(m.add("Hello", "World")); // String + String
        System.out.println(m.add(5, 6, 7)); // int + int + int
    }
}
