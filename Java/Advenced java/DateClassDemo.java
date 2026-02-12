import java.util.*;
public class DateClassDemo {
   public static void main(String[] args) {
        System.out.println("The maximum value of long is :" + Long.MAX_VALUE);
        System.out.println("The value of current time in ms : " + System.currentTimeMillis());
      Date d= new Date();
        System.out.println("The current date is : " + d);

        Date d1= new Date(1621709639111l);
        System.out.println("The date calculated form miliseconds is : " + d1);
          Date d3= new Date();
        System.out.println("The current date is : " + d3);

        Date d1e= new Date(1621709639111l);
        System.out.println("The date calculated form miliseconds is : " + d1e);
         System.out.println("The number of milliseonds passed since Jan 1, 1970 :" +d.getTime() );
         System.out.println("The current date is : "+ d.getDate());
        System.out.println("The current year is : "+ d.getYear()); //19
    }
}