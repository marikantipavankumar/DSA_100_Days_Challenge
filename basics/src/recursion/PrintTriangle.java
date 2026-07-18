package recursion;

import java.util.Arrays;

public class PrintTriangle {
    static void main() {
        int[] nums = {1,2,3,4,5};
        helperFun(nums);
    }
    public static void helperFun(int[] nums){
        if(nums.length<1){
            return;
        }
        int[] temp = new int[nums.length-1];
        for(int i=0;i<nums.length-1;i++){
            int ans = nums[i]+nums[i+1];
            temp[i]=ans;
        }

        helperFun(temp);
        System.out.println(Arrays.toString(nums));
    }
}
