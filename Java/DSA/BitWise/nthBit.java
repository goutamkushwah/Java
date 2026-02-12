// find the nth bit of a number
public class nthBit {
    public static void main(String[] args) {
        int n = 18;
        int i = 5;
        int nthBit = (n >> (i - 1)) & 1;
        System.out.println("The " + i + "rd bit of " + n + " is: " + nthBit);

    }
}
