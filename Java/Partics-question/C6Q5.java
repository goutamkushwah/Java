// Date : 07/04/2025
// Write a Java program to reverse an array.
public class C6Q5 {
    public static void main(String[] args) {
       /* int a[] = {1, 2, 3, 4, 5};
        System.out.println("Reversed array:");
        for (int i = a.length - 1; i >= 0; i--) { // Start from the last index
            System.out.println(a[i]); // Print the element at index i
        }
             */
            int [] arr = {1, 21, 3, 4, 5, 34, 67};
            int l = arr.length;
            int n = Math.floorDiv(l, 2);
            int temp;
    
            for(int i=0; i<n; i++){
                // Swap a[i] and a[l-1-i]
                // a   b   temp
                // |4| |3| ||
                temp = arr[i];
                arr[i] = arr[l-i-1];
                arr[l-i-1] = temp;
            }
    
            for(int element: arr){
                System.out.print(element + " ");
            }
    }
}