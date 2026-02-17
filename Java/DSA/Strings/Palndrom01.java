// ex -
//Words: level, radar, noon, kayak, madam, racecar.
//Numbers: 121, 1331, 4554.
//Phrases: "A man, a plan, a canal: Panama" (When you remove spaces and punctuation, it becomes amanaplanacanalpanama).
import java.util.Scanner;
public class Palndrom01{
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
     String a = sc.nextLine(); 
     
    System.out.println(is_palandrom(a));
  }  
  static boolean is_palandrom(String a){
if(a.length()==0){
  return true;
}
for (int i = 0;i<=a.length()/2;i++){
  char Start = a.charAt(i);
  char end = a.charAt(a.length()-1-i);
 if(Start != end){
    return false;
 }

  }
  return true;
}
}