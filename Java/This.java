/*
class This {
    int x;

    // Getter for x
    public int getX() {
        return x;
    }

    // Constructor with a parameter
    This(int x) {
        x = x; // Use 'this' to refer to the instance variable
    }

    // Call the constructor
    public static void main(String[] args) {
        This obj1 = new This(65); // Corrected class name
        System.out.println(obj1.getX());
    }
}
    // output 0 
 */
class This {
    int x;

    // Getter for x
    public int getX() {
        return x;
    }

    // Constructor with a parameter
    This(int x) {
        this.x = x; // Use 'this' to refer to the instance variable
    }

    // Call the constructor
    public static void main(String[] args) {
        This obj1 = new This(65); // Corrected class name
        System.out.println(obj1.getX());
    }
}