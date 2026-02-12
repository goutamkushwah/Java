// Date - 18/03/2025
/*Calculate income tax paid by an employee to the government as per the slabs mentioned below:

Income Slab	Tax
2.5L – 5.0L  	5%
5.0L – 10.0L 	20%
Above 10.0L	30%
Note that there is not tax below 2.5L. Take the input amount as input from the user. */
import java.util.Scanner;

public class C4Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your income: ");
        double income = sc.nextDouble();
        double tax = 0;

        if (income >= 250000 && income < 500000) {
            tax = 0.05 * (income - 250000);
        } else if (income >= 500000 && income < 1000000) {
            tax = 0.05 * (500000 - 250000) + 0.20 * (income - 500000);
        } else if (income >= 1000000) {
            tax = 0.05 * (500000 - 250000) + 0.20 * (1000000 - 500000) + 0.30 * (income - 1000000);
        }

        System.out.println("Income tax paid by you is: " + tax);
        sc.close();
    }
}