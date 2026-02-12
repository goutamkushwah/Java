// Date : 10/04/2025
// Quick quiz: Overloaded the employee constructor to initialize the salary to Rs 10,000
class Employee {
    private int salary;
    private String name;

    // Default constructor
    Employee() {
        this.salary = 10000;
        this.name = "Goutam";
        System.out.println("The name of the first employee is: " + name);
        System.out.println("The salary of the first employee is: " + salary);
    }

    // Parameterized constructor
    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("The name of the second employee is: " + name);
        System.out.println("The salary of the second employee is: " + salary);
    }
}

public class C9Q2 {
    public static void main(String[] args) {
        Employee emp1 = new Employee(); // Create an object of Employee using the default constructor
        Employee emp2 = new Employee("Shivam", 200000); // Create another object of Employee using the parameterized constructor
    }
}