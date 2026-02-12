// Date-18/03/2025
/*Write a program to find out wheather a student is pass or fail if it requiers total 40% 
and at least 33% in each subjects to pass assume 3 subjects and take marks as an  input 
from the user */
import java.util.Scanner;
public class C4Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of 3 subjects: ");
        int math = sc.nextInt();
        int science = sc.nextInt();
        int english = sc.nextInt();
        int total = math + science + english;
        double percentage = (total/300.0)*100;
        if(percentage >=40){
            if(math>=33 && science>=33 && english>=33){
                System.out.println("You are pass");
            }
            else{
                System.out.println("You are fail becase you have less than 33% in one of the subjects");
            }
        }
        else{
            System.out.println("You are fail");
        }
 
    }
}