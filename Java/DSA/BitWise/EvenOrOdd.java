// Check the number is even or odd using bitwise operator
public class EvenOrOdd {
   public static void main(String[] args) {
int n = 68;
System.out.println(is_odd(n));    
   } 
   private static boolean is_odd(int n) {
    return (n & 1) == 1; // Check the least significant bit
   }
}
