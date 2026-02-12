import java.util.ArrayList;
public class reveerseArray {
  public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
     reveerseArray(arr);   
     System.out.println(java.util.Arrays.toString(arr));
  }
   static void  reveerseArray(int arr[]){
int start = 0;
int end = arr.length-1;
while(start<end){
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
    start++;
    end--;
}
    }
}
    

