import java.util.ArrayList;
public class Arraylist {
public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(); // Create an ArrayList of Strings
list.add(67); // Add elements to the ArrayList
System.out.println("ArrayList: " + list); // Print the ArrayList
System.out.println(list.contains(67)); // Check if the ArrayList contains 67
System.out.println(list.contains(3)); 
list.set(0,99);
System.out.println(list);
list.remove(0);
System.out.println(list);
for(int i = 0; i < list.size(); i++) {
    System.out.print(list.get(i) + " ");
}
    System.out.println(list.size());
    //system.out.println(list.isEmpty());
    System.out.println(list);
}
}    

