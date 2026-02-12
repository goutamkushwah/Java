// Date - 13/02/2025
//write a java program to encrypt a grade by adding 8 to it Decrypt it to show the correct 
//grae
public class C2Q2 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);
        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
