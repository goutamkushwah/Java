//Date : 07/04/2025
//Write a program to find out whether a given integer is present in an array or not.
public class C6Q2 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b =5;
        boolean find = false;
        for(int i :a){
            if(i==b){
              find = true;
                break; 
            }
          
        }
        if(find==true){
            System.out.println("iteam is parsent in the array");
        }
        else{
            System.out.println("iteam is not parsent in the array");
        }
            /*
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};

        float num = 45.7f;
        boolean isInArray = false;
        for(float element:marks){
            if(num==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("The value is present in the array");
        }
        else{
            System.out.println("The value is not present in the array");
        }
 */

    }
}
