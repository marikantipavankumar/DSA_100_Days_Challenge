package day53;

import java.util.HashMap;

public class PeakElement {
    static void main() {
        int[] nums = {1,2,3,1};
        int ans = findPeakElement(nums);
        System.out.println("Peak Element Index is:"+ans+", and Element is:"+nums[ans]);
    }
    public  static int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }

        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
        //         return i;
        //     }
        // }
        // return -1;

        int big = Integer.MIN_VALUE;
        int i;
        int index = 0;
        for( i=0;i<nums.length;i++){
            if(nums[i]>big){
                big=nums[i];
                index = i;
            }
        }
        return index;
    }
}
