
public class if1 {
    public static void main(String[] args) {
        int salary = 25000;
        if (salary > 10000) {
            salary = salary + 2000; // This will increase the salary by 2000 if the condition is true
        }
        else {
            salary = salary + 1000; // This will increase the salary by 1000 if the condition is false
        }
        System.out.println(salary);

    }
}
