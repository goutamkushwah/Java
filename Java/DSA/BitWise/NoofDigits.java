//find the number of digit in base b
public class NoofDigits {
    public static void main(String[] args) {
       int n =3456790;
       int b =10;
        int ans = (int)(Math.log(n)/Math.log(b))+1;
    System.out.println(ans);
         
      }
}
