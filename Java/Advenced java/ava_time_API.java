import java.time.*;

public class ava_time_API {
    public static void main(String[] args) {
       /* Clock cl = Clock.systemDefaultZone();
        System.out.println(cl.getZone());
        System.out.println(cl.instant());

        Duration d1 = Duration.between(LocalTime.MIN, LocalTime.NOON);  // '00:00' to '12:00'
        System.out.println(d1.isNegative());

        Duration d2 = Duration.between(LocalTime.MAX, LocalTime.MIN);   // '23:59:59.999999999' to '00:00'
        System.out.println(d2.isNegative());

        Duration d3 = Duration.between(LocalTime.MIN, LocalTime.MIDNIGHT);  // '00:00' to '00:00'
        System.out.println(d3.isZero());

        Duration d4 = Duration.between(LocalTime.MAX, LocalTime.MIN);   // '23:59:59.999999999' to '00:00'
        System.out.println(d4.isZero());
        
         
                LocalDate d5 = LocalDate.now();
                System.out.println(d5);
                */
                /*
                 LocalDate d = LocalDate.parse("2021-05-27");
                LocalDate d1= LocalDate.parse("2021-05-26");
                LocalDate d2= LocalDate.parse("2021-05-26");

                System.out.println(d1.equals(d));
                System.out.println(d2.equals(d1));
                //LocalDate d = LocalDate.parse("2021-05-27");
                System.out.println(d.withYear(2001));
                 LocalTime t = LocalTime.now();
                System.out.println(t);
*/
   /*LocalTime t = LocalTime.of(13,18,29);
                System.out.println("Time before : "  + t);

                LocalTime t1= t.plusHours(5);
                System.out.println("Time after adding 5 hours : " + t1);
*/
  LocalTime t = LocalTime.of(15,28,19);
                System.out.println("Time before : "  + t);

                LocalTime t1= t.minusMinutes(8);
                System.out.println("Time after subtracting 8 minutes : " + t1);
    }
}