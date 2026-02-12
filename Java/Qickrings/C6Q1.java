// Date - 07/04/2025
//Quick Quiz: Write a Java program to print the elements of an array in reverse order.
public class C6Q1 {
public static void main(String[] args) {
    int array[] = {1, 2, 3, 4, 5};
    for(int i = array.length-1;i>=0;i--){
        System.out.print(array[i] + " ");   
    }
}
}