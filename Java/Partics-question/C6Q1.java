// Date: 07/04/2025
//Create an array of 5 floats and calculate their sum.
public class C6Q1 {
    public static void main(String[] args) {
       /* float sum = 0.0f;
        float a [] = new float[5];
        a[0] = 1.2f;
        a[1] = 2.3f;
        a[2] = 3.4f;
        a[3] = 4.5f;
        a[4] = 5.6f;
    for(int i=0;i<a.length;i++){
     sum = sum + a[i];
    }
    System.out.println("Sum of the array is: " + sum); */
      float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for(float element:marks){
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);


    }
}
