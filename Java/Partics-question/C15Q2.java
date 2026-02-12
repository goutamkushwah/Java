//Date : 02/06/2025
//Question 2: Use the Date class in Java to print the time in the following format : 21:47:02.
import java.util.Date;

public class C15Q2 {
    public static void main(String[] args) {
     Date d= new Date();
     System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());   
    }
}
   