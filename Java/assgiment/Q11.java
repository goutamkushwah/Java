// Date : 16/04/2025
/*
 * Write a java program to declare , initalize and display the contents of an array of 5 integer 
 * values . Also show in java how the length of array can be found
 */
public class Q11 {
    public static void main(String[] args) {
        int arr [] =  {1,2,3,4,5};
        for(int i=0;i<arr.length ;i++){
            System.out.println("Element at index " + i + ": " + arr[i]);
        }
        System.out.println("The length of the array is: " + arr.length);
    }
    
}
