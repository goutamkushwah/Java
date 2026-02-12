// check  the number is power of 2 or not
public class PowerOfTwo {
    public static void main(String[] args) {
        int n =18;
    boolean ans = (n & (n-1))==0;
    System.out.println(ans);
}
}