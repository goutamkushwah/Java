/*import java.io.*;
import java.lang.Thread;
public class Thread_method {
    public static void main(String[] args){
        try {
            for (int i = 1; i <=5; i++) {
                Thread.sleep(2000);
                System.out.println(i);
            }
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
*/
/*
class CWH1 extends Thread{
    public void run(){
        try {
            for (int i=0;i<5;i++){
                System.out.println("Child Thread");
                Thread.sleep(4000); // Child thread is put to sleep for 4000ms. As soon as child thread goes to sleep main thread interrupts it. And, InterruptedException is generated which is handled by the catch block. 

            }
        }
        catch (InterruptedException e)
        {
            System.out.println("Child Thread Interrupted");
        }
	System.out.println("Thread is running");

    }
}

public class Thread_method extends Thread{
    public static void main(String[] args) {
         CWH1 t= new CWH1();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
*/
/*
class CWH1 extends Thread{
    public void run(){
        for (int i=0;i<10;++i){
            System.out.println(i);
        }
    }
}

public class Thread_method extends Thread{
    public static void main(String[] args) {
         CWH1 t= new CWH1();
         t.start();
         t.interrupt();
        System.out.println("Main Thread");

    }
}
 */

class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
//            System.out.println("I am a thread");
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}

class MyNewThr2 extends Thread{

    public void run(){
        while(true){
//            System.out.println("I am a thread");
            System.out.println("My Thank you: ");
        }
    }
}

public class Thread_method {
    public static void main(String[] args){
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try{
//            t1.join();
//        }
//        catch(Exception e){
//            System.out.println(e);
//        }

        t2.start();

    }
}
