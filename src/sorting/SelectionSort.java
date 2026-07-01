package sorting;

import  java.util.*;
public class SelectionSort {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] res = selectionSort(arr);
        System.out.println("Selection sorting is :"+Arrays.toString(res));
    }

    public static int[] selectionSort(int[] arr){
        int n = arr.length;

        for(int i=0;i<n;i++){
            int minIndex =i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex] = temp;
        }

        return arr;
    }
}
