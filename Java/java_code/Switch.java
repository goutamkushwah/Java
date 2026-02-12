import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 23:
                System.out.println("You are going to join a job!");
                break;
            case 60:
                System.out.println("You are going to retire!");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }
        sc.close();
    }
}