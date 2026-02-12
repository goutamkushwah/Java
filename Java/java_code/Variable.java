public class Variable {
    static int b = 20;
    int c = 5; // instance variable

    public static void main(String[] args) {
        int a = 10; // local variable
        Variable ref = new Variable();
        System.out.println(a);
        System.out.println(Variable.b);
        System.out.println(ref.c);
    }
}