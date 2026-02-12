//Date : 02/06/2025
//Questio1: Create an ArrayList and store the names of ten students inside it. Print it using a for each loop.
import java.util.ArrayList;

public class C15Q1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Goutam");
        list.add("Shivam");
        list.add("Devang");
        list.add("Diksha");
        list.add("Chahat");
        list.add("Sakshi");
        list.add("Sapna");
        list.add("Dipanshu");
        list.add("Vishal");
        list.add("Shruti");
       for(Object o: list) {
        System.out.println(o);
}
    }
}
