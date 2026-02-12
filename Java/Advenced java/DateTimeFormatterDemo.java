import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {

       /* LocalDateTime dt = LocalDateTime.now();
        System.out.println("The current date is : " + dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy"); // This is the format

        String myDate = dt.format(df); // Creating date string using date and format
        System.out.println("Date after formatting : " + myDate);
*/
 /*LocalDateTime dt = LocalDateTime.now();

                        DateTimeFormatter df = DateTimeFormatter.ISO_LOCAL_DATE;// Formatting the date in the ISO format

                        String myDate = dt.format(df); // Creating date string using date and format
                        System.out.println("Date in ISO format : "+ myDate);
                        */
                        
                       /* LocalDateTime dt = LocalDateTime.now();

                        DateTimeFormatter df = DateTimeFormatter.ISO_WEEK_DATE;// 

                        String myDate = dt.format(df); 
                        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);
                        */
                                                LocalDateTime dt = LocalDateTime.now();

                        DateTimeFormatter df = DateTimeFormatter.ISO_ORDINAL_DATE;//

                        String myDate = dt.format(df);
                        System.out.println("Date in ISO_WEEK_DATE Format  : "+ myDate);
    }
}