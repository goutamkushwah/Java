import java.util.*;
public class Calander {
        public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Current year is :"+ c.get(Calendar.YEAR));
        System.out.println("Current month is :"+ c.get(Calendar.MONTH)); //The indexing for month field ranges from [0,11]
        System.out.println("Current day is :"+ c.get(Calendar.DAY_OF_WEEK));
        System.out.println("Current hour is :"+ c.get(Calendar.HOUR_OF_DAY));
        System.out.println("Current minute is :"+ c.get(Calendar.MINUTE));
        System.out.println("Current second is :"+ c.get(Calendar.SECOND)); 
         Calendar c1 = Calendar.getInstance();
        System.out.println("Current date is : " + c1.getTime());
        c1.add(Calendar.YEAR, 4);
        System.out.println("After 4 years  : "+ c1.getTime());
        c1.add(Calendar.YEAR, -12);
        System.out.println("Before 12 years  : "+ c1.getTime());
        c1.add(Calendar.MONTH,2);
        System.out.println("After 2 months  : "+ c1.getTime());   
        Calendar c3 = Calendar.getInstance();
        System.out.println(c3.getWeeksInWeekYear());  
        System.out.println(" The maximum no. of weeks in a year : " + c3.getMaximum(Calendar.WEEK_OF_YEAR));
    }

}
