package day46;

import java.util.Arrays;

public class NextGreaterEl_II_BF_L_503 {
    static void main() {
        int[] nums={1,5,3,6,8};
        int[] ans = nextGreaterElements(nums);
        System.out.println("Next Greater Elements for each element in the given array is:"+ Arrays.toString(ans));
    }

    public static int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0;i<ans.length;i++){
            ans[i]=-1;
        }

        for(int i=0;i<nums.length;i++) {
            boolean found = false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    ans[i]=nums[j];
                    found = true;
                    break;

                }
            }
            if(found==false){
                for(int r=0;r<i;r++){
                    if(nums[r]>nums[i]){
                        ans[i]=nums[r];
                        break;
                    }
                }
            }
        }
        return ans;
        }
}

