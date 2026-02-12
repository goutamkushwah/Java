// find th unique number in the array where every element is repeated twice except one
public class UniqueItem {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 3};
        System.out.println(findUnique(arr));
    }
    private static int findUnique(int[] arr) {
      int unique =0;
      for(int num : arr){
        unique ^= num;
      }
      return unique;
    }
}
