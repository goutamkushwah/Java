// Date : 07/04/2025
//Write a Java program to find the maximum element in an array.
public class C6Q6 {
    public static void main(String[] args) {
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int max = Integer.MIN_VALUE;
        for(int i:arr){
            if(i>max){
                max = i;
            }
        }
        
        System.out.println("The maximum value in the array is: " + max);
       // System.out.println(Integer.MIN_VALUE);
        //System.out.println(Integer.MAX_VALUE);
    }
}
