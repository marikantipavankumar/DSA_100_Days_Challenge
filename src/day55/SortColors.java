package day55;

import java.util.Arrays;

public class SortColors {
    static void main() {
        int[] nums = {2,0,2,1,1,0};
         sortColors(nums);

    }

    public static void sortColors(int[] nums){
        boolean swapped;
        for(int i=0;i<nums.length;i++){
            swapped = false;
            for(int j=0;j<nums.length-1;j++){
                if(nums[j+1]<nums[j]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                    swapped = true;
                }

            }
            if (swapped == false)
                break;
        }

        System.out.println(Arrays.toString(nums));
    }
}
