
class Practice13 extends Thread{
    public void run(){
    
            System.out.println("Good Morning!");
        }
    }

class Practice13b extends Thread{
    public void run(){

            System.out.println("Welcome");

    }
}

public class C13Q4 {
    public static void main(String[] args) {
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
      System.out.println(p2.getState());
        p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
