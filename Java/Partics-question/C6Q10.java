//Write a code for multiplication of two matrixes.
// Date : 07/04/2025
public class C6Q10 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2 }, { 5, 6 } };
        int b[][] = { { 7, 8 }, { 9, 10 } };
        int c[][] = new int[2][2];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < b.length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("The multiplication of two matrixes is: ");
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
