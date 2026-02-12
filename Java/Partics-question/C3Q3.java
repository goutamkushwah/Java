//Date - 16/03/2025
/*Write a java program to fill in a latter template which looks like belw

latter = "Dear<|name|>,thanks a lot"
Replace <|name|>with a string(same name */
public class C3Q3 {
    public static void main(String[] args) {
        String latter = "Dear <|name|>,trans a lot";
        latter = latter.replace("<|name|>", "Goutam");
        System.out.println(latter);
        
    }
    
}
