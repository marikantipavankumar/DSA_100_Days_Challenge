package sorting_problems;

import java.util.Arrays;

public class BubbleSort {
    static void main() {
        int[] arr = {10,38,73,89,77,93,87,0};
        int[] result = bubbleSortImpl(arr);
        System.out.println("Sorted Array is:"+ Arrays.toString(result));
    }

    public static int[] bubbleSortImpl(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
