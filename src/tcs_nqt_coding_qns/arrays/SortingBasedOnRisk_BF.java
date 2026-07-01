package tcs_nqt_coding_qns.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortingBasedOnRisk_BF {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the n elements into the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] result = sortArray(arr);
        System.out.println("Array after sorting is:"+ Arrays.toString(result));

    }
    public  static int[] sortArray(int[] arr){
        int c0=0,c1=0,c2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;
            }
            else if (arr[i]==1) {
                c1++;
            } else if (arr[i]==2) {
                c2++;
            }
        }

        int i=0;
            while (c0>0){
                arr[i]=0;
                c0--;
                i++;
            }

            while (c1>0){
                arr[i]=1;
                c1--;
                i++;
            }

            while (c2>0){
                arr[i]=2;
                c2--;
                i++;
            }

        return  arr;
    }
}
