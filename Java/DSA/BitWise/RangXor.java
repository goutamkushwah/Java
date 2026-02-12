// Find the XOR of a number from 0 to n

public class RangXor {
    public static void main(String[] args) {
       int a=3;
       int b=9; 
       int ans  = xor(a-1) ^ xor(b); System.out.println(ans);
     System.out.println(ans);
     // only for check will  give tle for largr number
        int ans2 =0;
        for (int i = a; i <= b; i++) {
            ans2 ^= i;
        }
        System.out.println(ans2);
    }
    static int xor(int a){
        if(a%4==0){
            return a;
        } else if(a%4==1){
            return 1;
        } else if(a%4==2){
            return a+1;
        } else{
            return 0;
        }
    }

}
