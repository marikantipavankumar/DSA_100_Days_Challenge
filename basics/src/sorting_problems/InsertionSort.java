package sorting_problems;

import java.util.Arrays;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        System.out.println("Array before sorted is:"+Arrays.toString(arr));
        for(int i=1;i<arr.length;i++){
            int j = i-1;
            int k =  arr[i];

            while(j>=0 && arr[j]>k){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=k;
        }
        System.out.println("Array after sorted by Insertion sort is: "+Arrays.toString(arr));
    }
}

/* In Insertion sort we have to sort the element one by one by comparing with the already sorted
elements on its left.
 .. in Insertion sort The first element is considered as sorted. We have to compare from the second elemnet with the first element.
 and so on

 we have to place the element in its correct position by checking with the previous sorted list in reverse order till first element.
 */