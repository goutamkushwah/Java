// Create a program to print the pascal triangle
//     1
//    121
//   1331
// 
//  14641
public class Pasacal {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }
            // Print numbers in the current row
            int number = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1); // Calculate the next number in the row
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
