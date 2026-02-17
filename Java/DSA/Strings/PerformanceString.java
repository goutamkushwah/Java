//  when this is use many grabage collection are used because in memory it was run 
// that are stored in series a , ab ,abc ,abcd ............................
// final output was abcdefghijklmnopqrstuvwxyz
// a, ab ,abc ,abcd ...... are grabage and tha is increase space coplexity
// Time complexity = O(n2)
// to  reduce that prolem we use StringBuilder -- class
public class PerformanceString {
public static void main(String[] args) {
    
    String series = "";
    for(int i =0;i<26;i++){
        char c= (char) ('a'+i);
        series+=c;
        // System.out.println(series);
    }
    System.out.println(series);
}    
}
