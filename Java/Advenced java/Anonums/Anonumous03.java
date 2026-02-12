@FunctionalInterface
interface Human{
    void walk();
}

public class Anonumous03 {
    public static void main(String[] args) {
        Human John = new Human() {
            @Override
            public void walk() {
                System.out.println("John walks.");
            }
        };
        John.walk();
    }
}

