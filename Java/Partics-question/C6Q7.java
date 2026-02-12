// Date : 07/04/2025
//Write a Java program to find the minimum element in a Java array.
public class C6Q7 {
    public static void main(String[] args) {
        int [] arr = {1, 2100, 3, 455, 5, 34, 67};
        int min = Integer.MAX_VALUE;
        for(int i:arr){
            if(i<min){
                min = i;
            }
        }
        
        System.out.println("The minimum value in the array is: " + min);
        
    }
}
