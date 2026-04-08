public class Shadowing {
    static int x = 10; // This is a class variable (static variable)
    public static void main(String[] args) {
        System.out.println("Value of x in main method: " + x); // This will print 10
        int x = 20; // This is a local variable that shadows the class variable
        System.out.println("Value of x in main method after shadowing: " + x);
        fun();   
    }
    static void fun() {
        System.out.println("Value of x in fun method: " + x); // This will print 10, as it refers to the class variable
    }
}
