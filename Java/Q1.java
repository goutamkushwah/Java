//13/03/2025
// question - write a program for calculate percanteage of student and where is 5 subject 

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("What is maximum number of any subject");
        int MAX=sc.nextInt();
        System.out.println("Enter the number of DBMS");
        int DBMS = sc.nextInt();
        System.out.println("Enter the number of Computer Network");
        int CN = sc.nextInt();
        System.out.println("Enter the number of Algoritham Design");
        int ADA = sc.nextInt();
        System.out.println("Enter the number of Softwer Engenering");
        int SW = sc.nextInt();
        System.out.println("Enter the number of Java");
        int JAVA = sc.nextInt();
        int total = DBMS+CN+ADA+SW+JAVA;
     
        float per = (total * 100.0f) / (MAX * 5);

        System.out.println("The percantage of student is : "+per);
    }
}
