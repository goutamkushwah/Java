// Date : 08/04/2025
//Write a function to convert Celsius temperature into Fahrenheit.
import java.util.Scanner;

public class C7Q9 {
    static int celsiusToFahrenheit(int celsius) {
        int fahrenheit = (celsius * 9 / 5) + 32; // Declare the fahrenheit variable
        return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int celsius =sc.nextInt(); ;
        int fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}