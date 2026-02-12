//Date : 02/06/2025
/*Question 5: Create a Set in java. Try to store the duplicate values elements inside this
 set and verify that only one instance is stored. */
import java.util.HashSet;

public class C15Q5 {
    public static void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
                s.add(5);
                s.add(6);
                s.add(46);
                s.add(60);
                s.add(9);
                s.add(6);
                System.out.println(s);
    }
}
