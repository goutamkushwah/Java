//Date : 02/06/2025
//Question 2: Suppress the warning generated in question number 2.

    class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}

public class C16Q2 {
    public static void main(String[] args) {
        @SuppressWarnings("deprecation")
        MyDeprecated d = new MyDeprecated();
        d.meth1();
    }
}
