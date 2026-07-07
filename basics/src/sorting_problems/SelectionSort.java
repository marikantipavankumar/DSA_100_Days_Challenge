package sorting_problems;
import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {64,35,12,22,11};
        System.out.println("Original Array :"+ Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++){
            int min = i;
            int curr_min = i+1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[curr_min]){
                    curr_min=j;
                }
            }
            if(arr[curr_min]<arr[min]){
                int t =arr[curr_min];
                arr[curr_min]=arr[min];
                arr[min]=t;
            }
        }

        System.out.println("Array after performing Selection Sort is: "+ Arrays.toString(arr));
    }
}
