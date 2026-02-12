//Date : 25/04/2025
//prove that you cannot access default property but can access protected properly from the
// subclass.
package child;
import parent.ParentClass; // Import the ParentClass from the parent package
public class C12Q4 {
    public void displayProperties() {
        // System.out.println("Default Property: " + defaultProperty); // This will cause an error
        System.out.println("Protected Property: " + protectedProperty); // Accessible
    }
    public static void main(String[] args) {
        C12Q4 obj = new C12Q4();
        obj.displayProperties(); // Call the method to display properties
    }
}  