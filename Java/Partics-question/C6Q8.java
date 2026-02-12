// Date : 07/04/2025
//Write a Java program to find whether an array is sorted or not.
public class C6Q8 {
    public static void main(String[] args) {
        //int a[] = {1, 2, 3, 4, 5,9, 7, 8};
int a[] = {1, 2, 3, 4, 5, 6, 7, 8};
        boolean isSorted = true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                isSorted = false;
                break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted .");
        }
        else{
            System.out.println("The array is not sorted .");
        }
    }
}
