 abstract class Vehicle{
    abstract void drive();
}

public class Ano02 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle() {
            @Override
            void drive() {
                System.out.println("I'm driving a car.");
            }
        };
        car.drive();
        }
}

