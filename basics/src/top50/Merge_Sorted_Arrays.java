package top50;

import java.util.Arrays;
import java.util.Scanner;

public class Merge_Sorted_Arrays {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the array 1:");
        int m = sc.nextInt();
        int[] arr1 = new int[m];
        System.out.println("Enter the length of the array 2:");
        int n = sc.nextInt();
        int[] arr2 = new int[n];


        System.out.println("Enter the elements into the array 1");
        for(int i=0;i<m;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Enter the elements into the array 2");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
        }

        int[] res = sortedArray(arr1,arr2,m,n);
        System.out.println("Sorted Array is: "+ Arrays.toString(res));

    }

    static  int[] sortedArray(int[]arr1,int[]arr2,int m,int n){
        int[] res = new int[m+n];
        int i=0,j=0;
        int k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                res[k]=arr1[i];
                k++;
                i++;
            }
            else if(arr1[i]>arr2[j]){
                res[k]=arr2[j];
                k++;
                j++;
            }
        }

            while(i<arr1.length){
                res[k]=arr1[i];
                k++;
                i++;
            }

            while(j<arr2.length){
                res[k]=arr2[j];
                k++;
                j++;
            }

        return res;
    }
}
