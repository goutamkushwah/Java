//Given an number n find the number of set bit in it 
public class noOFSetBit {
    public static void main(String[] args) {
        int n =197;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(SetBit(n));
    }
    private static int SetBit(int n) {
        int count = 0;
        while (n>0) {
        n = n & (n-1);
        count++; 
    }

        return count;
    }
}
