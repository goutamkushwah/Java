// Date - 07/04/2025
// Question - 9: Write a program to sort an array .
public class C6Q9 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5, 6, 10, 8};
        System.out.println("Original array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        // Bubble sort algorithm
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Swap adjacent elements if they are in the wrong order
                    int swap = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = swap;
                }
            }
        }

        System.out.println("The sorted array is: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}