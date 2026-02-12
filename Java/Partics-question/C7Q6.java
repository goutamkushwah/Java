// Date : 08/04/2024
//Write a function to find the average of a set of numbers passed as arguments.
public class C7Q6 {
  static int add(int ...arr){
    if(arr.length==0){
        return 0;
    }

            int result = 0;
            for (int a : arr){
                result = result + a;
            }
            return result/arr.length;
    }
    
    public static void main(String[] args){
        System.out.println(add(1,2));
        System.out.println(add(2,3,4));
        System.out.println(add(4,5,6));
    }
    }