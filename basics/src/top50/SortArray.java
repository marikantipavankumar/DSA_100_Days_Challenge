package top50;

import java.util.Arrays;
import java.util.Scanner;

// There are various methods to sort the array.

public class SortArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements into the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        // bubble sort - sort repeatedly by comparing the adjacent element,where in each pass the largest element
        // moves to the end
        bubbleSort(arr);

    }

    static  void bubbleSort(int[]arr){
        int n = arr.length;

        // sorting the array
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        //printing the elements from the Sorted array
        System.out.println(Arrays.toString(arr));
    }
}
