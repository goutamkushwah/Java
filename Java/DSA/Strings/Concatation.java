import java.util.ArrayList;

public class Concatation {
public static void main(String[] args) {
    String a="Goutam";
    String b="kushwah";
    System.out.println(a+" "+b);
    System.out.println('a'+'b'); // 195 when use  '' it is char and  "" it is Stringhen 
    //   System.out.println((char)('a'+'b')); //error
    System.out.println("a"+"b"); // ab
    System.out.println("a"+3);//a3
    System.out.println('a'+3);//100
    System.out.println((char)('a'+3));//d
    System.out.println("a"+1);
    System.out.println("Goutam"+new ArrayList<>()); // Goutam[]
    System.out.println("Goutam"+new Integer(56)); // Goutam56
    // System.out.println(new Integer(56)+new ArrayList<>()); // error
    
}    
}
