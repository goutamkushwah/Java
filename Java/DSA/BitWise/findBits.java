// find the right most set bit in the given number
public class findBits {
    public static void main(String[] args) {
     int a = 18;
        int rightMostSetBit = a & -a;
        System.out.println("The rightmost set bit in " + a + " is: " + rightMostSetBit);   
    }
}
