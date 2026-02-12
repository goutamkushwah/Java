//12/03/2025
// question - write a program for calculate percanteage of student and where is 3 subject 

import java.util.Scanner;

public class C1Q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Math");
        int math = sc.nextInt();
        System.out.println("Enter the number of Chemisery");
        int chemistey = sc.nextInt();
        System.out.println("Enter the number of physics");
        int physics = sc.nextInt();
       
        
        int total = math+chemistey+physics;
        float per= total/30;
        System.out.println("The percantage of student is : "+per);
    }
}

