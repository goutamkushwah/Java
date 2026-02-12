public class C7Q2_1 {
    static void pattern1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        System.out.println("Pattern of stars:");
        pattern1(n); // Call the method to print the pattern
    }
}
