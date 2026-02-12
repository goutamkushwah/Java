public class ChangingNumber {
    public static void main(String[] args) {
    int n =14;
    System.out.println(n);
    System.out.println(Integer.toBinaryString(n));
    System.out.println(Integer.toOctalString(n));
    System.out.println(Integer.toHexString(n));
    int binaryNum1 = 0b1010;   // 10 in decimal
    int binaryNum2 = 0B1111; 
    System.out.println(binaryNum1); // Output: 10 System.out.println(binaryNum2); // Output: 15
    System.out.println(Integer.toBinaryString(binaryNum1)); // Output: 1010 System.out.println(Integer.toBinaryString(binaryNum2)); // Output: 1111     
    int octalNum = 012; 
    System.out.println(octalNum); // Output: 10 System.out.println(Integer.toOctalString(octalNum)); // Output: 12
    System.out.println(Integer.toOctalString(octalNum)); // Output: ff
        int hexNum1 = 0xA;    // 10 in decimal
        int hexNum2 = 0X1F;
}
    
}