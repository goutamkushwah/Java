// Date : 01/06/2025
/*Write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an Illegal 
argument exception. */
import java.lang.Exception;
public class C14Q2 {
    public static void main(String[] args) {
        try{
       int a = 50/0;
        }
        catch (ArithmeticException e){
            System.out.println("Haha");
        }
        catch (IllegalArgumentException e){
            System.out.println("Some other exception occurred: " + e.getMessage());
        }
    }
}
