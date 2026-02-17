// see performance,java file to batter understand that
// string performance topic = performace.java+StringBulider01

public class StringBuilder01 {
    public static void main(String[] args) {
    
    StringBuilder series = new StringBuilder();
    for(int i =0;i<26;i++){
        char c= (char) ('a'+i);
        series.append(c);
        // System.out.println(series);
    }
    System.out.println(series);
}    
}

