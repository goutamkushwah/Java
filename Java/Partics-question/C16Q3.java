//Date : 02/06/2025
//Question 3: Create an interface and generate an instance from it.

interface MyInt{
    void display();
}

public class C16Q3 {
    public static void main(String[] args) {
        MyInt i = () -> System.out.println("I am display");
        i.display();
    }
}
