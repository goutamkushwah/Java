//Date : 02/06/2025
//Question 4: Repeat question number 2 using java.time API.
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;public class C15Q4 {
public static void main(String[] args) {
    LocalDateTime dt = LocalDateTime.now(); // This is the date
    DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s"); // This is the format
    String myDate = dt.format(df); // Creating date string using date and format
    System.out.println(myDate);
}  
}