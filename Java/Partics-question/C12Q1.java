// Date : 25/04/2025
//Create three classes calculator , Sc calculator and Hybridcalculator and
// group them into a package 
package calc;
class calculator{
    public void calculate(int a, int b){
        System.out.println("The sum is: " + (a+b));
    }
    }
    class Sc_calculator{
        public void calculate(int a, int b){
            System.out.println("The sum is: " + Math.sin(a+b));
        }
    }
    class ybridcalculator{
        public void calculate(int a, int b){
            System.out.println("The sum is: " + (a+b));
            System.out.println("The sum is: " + Math.sin(a+b));
        }
    }
public class C12Q1 {
    public static void main(String[] args) {
        System.out.println("This is example of package");
    }
}
