public class string_test {
 public static void main(String[] args) {
   //  String a = "Goutam Kushwah";
   //  System.out.println(a);

// Why use .equal()
   String a = "Goutam";
   String b= "Goutam";
   String c = "Goutam";
   String d= "Goutam Kushwah";
   String e = new String("Goutam");
   String f= new String("Goutam");
   String g = new String("Goutam");
   String h= new String("Goutam Kushwah");
   
   System.out.println(a==b);//true
   System.out.println(c==d);//false
   System.out.println(e==f);//false
   System.out.println(g==h);//false
   System.out.println(e.equals(f));//true
   System.out.println(g.equals(h));//false

}   
}
