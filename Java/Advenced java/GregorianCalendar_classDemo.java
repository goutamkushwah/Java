import java.util.*;
public class GregorianCalendar_classDemo {
    
    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();
        System.out.println(cal.isLeapYear(2000));
        System.out.println(cal.isLeapYear(2021));
        GregorianCalendar c = new GregorianCalendar();
        System.out.println("Date before rolling : " + c.getTime());

        c.roll(Calendar.MONTH, true);
        c.roll(Calendar.DATE, false);
        c.roll(Calendar.YEAR, true);

        System.out.println("Date after rolling : " + c.getTime());
        System.out.println("Calendar : " + c.getTime());

        System.out.println("The hashcode for this calendar is : "+ c.hashCode());
    }
}
