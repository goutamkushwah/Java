// Date : 16/04/2025
//Write a java program to print Fibonacci series upto 20 terms
// 0,1,1,2,3......
public class Q13 {
    public static void main(String[] args) {
    int a =0,b=1;
    for(int i=0;i<20;i++){
        System.out.print(a + ",");
        int c = a + b;
        a = b;
        b = c;

    }
    }
}
