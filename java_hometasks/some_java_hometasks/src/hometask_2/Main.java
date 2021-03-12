package hometask_2;

import java.util.Arrays;

public class Main {
    static void bubbleSort(int[] arr){
        int n = arr.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }

            }
        }
    }


    public static void main(String[] args) {
        int arr[] ={3,30,45,2,25,320,5,0,10,100,999,4};

        System.out.println("Array before sort");
        System.out.println(Arrays.toString(arr));
//

        bubbleSort(arr);

        System.out.println("Array after sort");
        System.out.println(Arrays.toString(arr));
    }
}
