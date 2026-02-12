public class Recursion {
        static void fun2(int n){
            if(n>0){
                fun2(n-1);
                System.out.println(n);
            }
    }
       
    public static void main(String[] args){
            int n = 5;
            fun2(n);
    }
    }
    
