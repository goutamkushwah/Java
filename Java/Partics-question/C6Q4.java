// Date: 07/04/2025
//Create a Java program to add two matrices of size 2x3.
public class C6Q4 {
    public static void main(String[] args) {
         int [][] a = {{1, 2, 3},
        {4, 5, 6}};
int [][] b = {{2, 6, 13},
        {3, 7, 1}};
int [][] result = {{0, 0, 0},
          {0, 0, 0}};
          for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }
            System.out.println("The sum of the two arrays is: ");
            for(int k=0;k<result.length;k++){
                for(int l=0;l<result[k].length;l++){
                    System.out.print(result[k][l] + " ");
                }
                System.out.println();
            }
    }
    
}
