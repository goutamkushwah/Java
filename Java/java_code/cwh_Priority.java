class   cwh_Priority extends Thread{  
 public void run(){  
   System.out.println("I'm thread : "+Thread.currentThread().getName());  
   System.out.println("I'm thread :"+Thread.currentThread().getPriority());  
  
  }  
 public static void main(String args[]){  
  cwh_Priority t1=new cwh_Priority();  
  cwh_Priority t2= new cwh_Priority();  
  t1.setPriority(Thread.MIN_PRIORITY);  // setting priority of t1 thread to MIN_PRIORITY (1)
  t2.setPriority(Thread.MAX_PRIORITY);  // setting priority of t2 thread to MAX_PRIORITY (10)
  t1.start();  
  t2.start();  
   
 }  
}   