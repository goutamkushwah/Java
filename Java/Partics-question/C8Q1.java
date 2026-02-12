// Date : 10/04/2025
/*Create a class Employee with the following properties and methods:
Salary (property) (int)
getSalary (method returning int)
name (property) (String) 
getName (method returning String)
setName (method changing name)
 */
class Employee {
int salary;
String name;
public int getSalary() {
    return salary;
}
public String getName() {
    return name;
}
public void  setName(String n) {
    name = n ;
}
}
public class C8Q1 {
    public static void main(String[] args) {
  Employee goutam = new Employee();
  goutam.setName("Goutam kushwah");
  goutam.salary=100000;
  System.out.println(goutam.getName());
  System.out.println(goutam.getSalary());   
  
}
}
