// Calculate the power of a number using bitwise operator
// a^b == 3^6 = 3*3*3*3*3*3 =729
public class Power {
    public static void main(String[] args) {
        int base =3;
        int power=6;
        int ans =1;
        while (power>0) {
        if((power & 1)==1){
        ans *= base;  
        }
        base *= base;
        power = power>>1;
    }
    System.out.println(ans);
}
}