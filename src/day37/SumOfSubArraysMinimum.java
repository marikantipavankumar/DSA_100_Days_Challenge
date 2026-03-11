package day37;

import java.util.Arrays;

public class SumOfSubArraysMinimum {
    static void main() {
        int [] arr = {3,1,2,4};
        int sum = subArraySum(arr);
        System.out.println(sum);
    }
    public static int subArraySum(int[] arr){
        System.out.println("Before sorting: "+Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("After Sorting: "+Arrays.toString(arr));

        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
