public class passingValue {
   public static void main(String[] args) {
    String name = "Goutam";
    greet(name); // Passing the value of name to the greet method
   } 
   static void greet(String naam) {
    System.out.println("Hello " + naam); // Using the passed value to greet the user
   }
}
