// Date : 10/04/2025
// Quick Quiz: Use the getters and setters from the main method
class Employee {
    private int id; // Private field
    private String name; // Private field

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
}

public class C9Q1 {
    public static void main(String[] args) {
        Employee emp = new Employee(); // Create an object of Employee

        // Use setters to set values
        emp.setId(101);
        emp.setName("Goutam kushwah");

        // Use getters to retrieve and print values
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}
