// Date : 16/04/2025
/*
 Write a java program to design a class Student that has three data member ; 
 Roll no ; marks; marks in five subject and member function to assign streams on the basis
  to table given below           
  1 90% or more - Computer     
  2 80-90%   - electronics 
  3  75-80%  Mechanical  
  4 70-75%  - Checmical 
  5 60-70%   - Civil 
 */
import java.util.Scanner;

class Student {
    int rollNo;
    int[] marks = new int[5];
    double percentage;
    String stream;

    // Method to input student details
    void inputDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();

        System.out.println("Enter marks for 5 subjects:");
        int total = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        percentage = total / 5.0;
    }

    // Method to assign stream based on percentage
    void assignStream() {
        if (percentage >= 90) {
            stream = "Computer";
        } else if (percentage >= 80) {
            stream = "Electronics";
        } else if (percentage >= 75) {
            stream = "Mechanical";
        } else if (percentage >= 70) {
            stream = "Chemical";
        } else if (percentage >= 60) {
            stream = "Civil";
        } else {
            stream = "No Stream Assigned (Below 60%)";
        }
    }

    // Method to display student info
    void display() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Assigned Stream: " + stream);
    }
}


public class Q15 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputDetails();
        s1.assignStream();
        s1.display();
    }
}
