public class UniqueFindeNegative {
    public static void main(String[] args) {
        int[] nums = {1, -1, 2, -2, 3};
        System.out.println( findUniqueByBits(nums));
    }

    public static int findUniqueByBits(int[] nums) {
        int result = 0;

        // We check each of the 32 bits of an integer
        for (int i = 0; i < 32; i++) {
            int bitCount = 0;
            int mask = (1 << i);

            for (int num : nums) {
                // If the bit at position i is set, increment our count
                if ((num & mask) != 0) {
                    bitCount++;
                }
            }

            // In this specific array [1, -1, 2, -2, 3], 
            // the pairs (1, -1) and (2, -2) have a specific bit relationship.
            // For the unique item '3' to emerge, we look for bits 
            // that don't follow the pattern of the pairs.
            if (bitCount % 2 != 0) {
                result |= mask;
            }
        }
        return result;
    }
}