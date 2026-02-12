//Amazon
// A magic number is a number which eventually reaches 1 when replaced repeatedly by the sum of the square of its 
// digits. If it loops endlessly in a cycle which does not include 1, then it is not a magic number.
// 5³  5²  5¹
// 0  0  1 → 5

// Then:

// 1 = 0 0 1 → 5
// 2 = 0 1 0 → 2S
// 3 = 0 1 1 → 30 (5 + 2S)
// 4 = 1 0 0 → 12S
// 5 =

public class MagicNumber {
    public static void main(String[] args) {
       int n =6;
       int ans = 0;
       int base =5;
       while(n>0){
       int last = n&1;
       n=n>>1;
       ans += last*base;
      base *= 5;
    }
    System.out.println(ans);
         
      }
}
