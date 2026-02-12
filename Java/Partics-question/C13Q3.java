//Date : 31/05/2025
//Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.
import java.util.ArrayList; 
class Thread1 extends Thread{
    public void run(){
        
        System.out.println("Welcome");
    }
}
class Thread2 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }
public class C13Q3{
    public static void main(String[] args) {
        Thread1 t1= new Thread1();
        Thread2 t2= new Thread2();
        t1.start();
        t2.start();
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println("Thread 1 priority: " + t1.getPriority());
        System.out.println("Thread 2 priority: " + t2.getPriority());
    }
}
