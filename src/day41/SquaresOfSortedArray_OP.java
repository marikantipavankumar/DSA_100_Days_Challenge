package day41;

import java.util.Arrays;

import static java.lang.Math.abs;

public class SquaresOfSortedArray_OP {
    static void main() {
        int[] arr={-4,-1,0,3,10};
        int[] nums=sortedArray(arr);
        System.out.println("Sorted array after finding squares is:"+ Arrays.toString(nums));

    }
    public static int[] sortedArray(int[] nums){
      int[] ans = new int[nums.length];
      int l = 0,r=nums.length-1,pos=r;
      while(l<=r){
          if(abs(nums[l])>abs(nums[r])){
              ans[pos]=nums[l]*nums[l];
              l++;
          }
          else{
              ans[pos]=nums[r]*nums[r];
              r--;
          }
          pos--;
      }
      return ans;
    }
}
