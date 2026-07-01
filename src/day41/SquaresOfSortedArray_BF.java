package day41;

import java.util.Arrays;

public class SquaresOfSortedArray_BF {
    static void main() {
        int[] arr={-4,-1,0,3,10};
        int[] nums=sortedArrayBF(arr);
        System.out.println("Brute Force Approach-Sorted array after finding squares is:"+ Arrays.toString(nums));
    }
    public static int[] sortedArrayBF(int[] nums){
        for(int i =0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
