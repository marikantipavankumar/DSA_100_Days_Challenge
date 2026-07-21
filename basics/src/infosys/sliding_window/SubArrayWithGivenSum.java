package infosys.sliding_window;

import java.util.Arrays;

public class SubArrayWithGivenSum {
    static void main() {
        int[]nums = {1,2,3,7,5};
        int t = 12;

        int[]result = findSubArray(nums,t);
        System.out.print("Indices of Sub Array are:"+ Arrays.toString(result));
    }
    public static int[] findSubArray(int[]nums,int target){
        int l = 0,sum=0;
       for(int r=0;r<nums.length;r++){
           sum = sum+nums[r];
           while(sum>target){
               sum = sum-nums[l];
               l++;
           }
           if(sum==target){
               return  new int[]{l,r};
           }
       }
        return new int[]{-1,-1};
    }

}
