//Date : 02/06/2025
//Question 3: Repeat question number 2 using the Calendar class.
import java.util.Calendar;
public class C15Q3 {
  public static void main(String[] args) {
     Calendar c = Calendar.getInstance();
 System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
  }  
}