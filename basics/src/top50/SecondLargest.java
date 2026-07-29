package top50;

import java.util.Scanner;

public class SecondLargest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements into the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int sl = findSecondLargest(arr);
        System.out.println("Second largest element in the given array is:"+sl);

    }

    static  int findSecondLargest(int[]arr){
        int fistLargest = Integer.MIN_VALUE;
        int sl = fistLargest;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>fistLargest){
                sl = fistLargest;
                fistLargest = arr[i];
            }

            if(arr[i]>sl && arr[i]<fistLargest){
                sl = arr[i];
            }
        }
        return sl;
    }
}
