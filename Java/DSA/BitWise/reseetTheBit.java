// set the n th  bit
public class reseetTheBit {
     public static void main(String[] args) { 
        int i =3;
        int n = 18; // 10010 int i = 2; int mask = ~(1 << (i - 1)); int result = n & mask; System.out.println("The number after resetting the " + i + "nd bit of " + n + " is: " + result);
        int result =set(n, i);
       System.out.println(result);
 } 
 private static int set(int n, int i) {
   return n | (1 << (i - 1));
 }
}