   

/**
 * <i>This is a simple documentation to show that HTML elements can be included in JavaDoc.</i>
 * @see <a href="https://www.codewithharry.com/videos/java-tutorials-for-beginners-1">Best Java Course Available For <b>Free</b></a>
 * */

public class Tags_for_Documenting_Classes {

    /** This method is used to return the sum of two numbers
      * @return Integer
      * @param a First parameter -  Integer
      * @param b Second parameter - Integer
      * */
    public int sum(int a, int b){
        return a + b;
    }

    /** This method is used to return the subtraction of two numbers
      * @return Integer
      * @param a First parameter -  Integer
      * @param b Second parameter - Integer
      * */
    public int subtraction(int a, int b){
        return a - b;
    } /** This method is used to return the divison of two numbers
  * @throws ArithmeticException if divided by 0
  * @return Integer
  * @param a First parameter -  Integer
  * @param b Second parameter - Integer
  * */
    public int divison(int a, int b){
       return a/b;
    }

    public static void main(String[] args) {
        System.out.println("This is my main method");
    }
}


