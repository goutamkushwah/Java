import java.util.Arrays;
public class Array {
    public static void main(String[] args) {  
    //  int arr[] = new int[5]; // Declare an array of integers with size 5
    //  arr[0] = 1; // Initialize the first element
    //     arr[1] = 2; // Initialize the second element
    //     arr[2] = 3; // Initialize the third element
    //     arr[3] = 4; // Initialize the fourth element

//    int arr[] = {1, 2, 3, 4, 5}; 
//    System.out.println("Array length: " + arr.length);
//    System.out.println("First element: " + arr[0]);
//    System.out.println("Last element: " + arr[arr.length - 1]);
// //    arr[0]=10;// Update the first element
// //    arr[4]=50;// Update the last element

//    // Print the array elements
//     for (int i = 0; i < arr.length; i++) {
//          System.out.print(arr[i] + " ");

//     } 

// // mulit - deminstional  array
// int [] [] array = {
//     {1, 2, 3},
//     {4, 5, 6},
//     {7, 8, 9}
// };
// for(int i = 0; i < array.length; i++) {
//     for(int j = 0; j < array[i].length; j++) {
//         System.out.print(array[i][j] + " ");
//     }
//     System.out.println(); // Move to the next line after each row
// }

int a [][] = {{1,2,3}, {4,5,6}, {7,8,9} };
// for(int row =0; row < a.length; row++) {
//     for(int col = 0; col < a[row].length; col++) {
//         System.out.print(a[row][col] + " ");
//     }
//     System.out.println();
    
// }   

for( int[] row : a) {
    System.out.println(Arrays.toString(row));
}
}
}
