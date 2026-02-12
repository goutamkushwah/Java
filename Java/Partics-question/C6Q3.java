// Date : 07/04/2025
//Calculate the average marks from an array containing marks of all students in physics
// using a for-each loop.
public class C6Q3 {
 public static void main(String[] args) {
    float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
    float ssum =0.0f;
    for(float element:marks){
        ssum += element;
              }
//float avg = ssum/marks.length;
//System.out.println("The average of the array is: " + avg);
System.out.println("The value of average marks is " + ssum/marks.length);
            }
    }
