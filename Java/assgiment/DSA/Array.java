 class Array {
    public static void main(String[] args) {
           int arr[] = {1, 2, 3, 4, 5};
           //it return object
        //    System.out.println(arr);
        
        // it return value of index 1      
        //  System.out.println(arr[1]);
        
        //  for (int i = 0; i < arr.length; i++) {
        //      System.out.println(arr[i]);
        //  }
        
        // update the value of index 1
        arr[1] = 10;
// for each loop
        // for (int i : arr){
        //         System.out.println(i);
        // }
     
        // multi dimensional array
        int arr2[][] = {{1, 2, 3}, {4, 5, 6},
        {7,8,9}};
        // for(int i = 0; i < arr2.length; i++){
        //     for(int j = 0; j < arr2[i].length; j++){
        //         System.out.print(arr2[i][j] + " ");
        //     }
        //     System.out.println();
       // }
    for (int i[] : arr2){
        for(int j : i){
            System.out.print(j + " ");
        }
        System.out.println();
    }
    }
}