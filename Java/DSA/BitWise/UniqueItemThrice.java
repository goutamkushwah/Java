// find unique item when all number present 3 times except one

public class UniqueItemThrice {
    public static void main(String[] args) {
        int[] arr = {6, 1, 3, 3, 3, 6, 6}; // here 1 is unique
        System.out.println("Unique number: " + findUnique(arr));
    }

    private static int findUnique(int[] arr) {
        int result = 0;
        // Loop through each bit position (0 to 31)
        for (int i = 0; i < 32; i++) {
            int bitSum = 0;
            int mask = (1 << i);
            for (int num : arr){
                if((num & mask) != 0){
                    bitSum++;
                }

            }
            // If the bitSum is not a multiple of 3, 
            // set that bit in our result
            if(bitSum % 3 != 0){
                result |= mask;
            }
        } return result;
               }
}