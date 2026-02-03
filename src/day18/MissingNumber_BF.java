package day18;

import java.util.Arrays;

public class MissingNumber_BF {

    public static void main() {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int missingElement = missingElement(nums);
        System.out.println("Missing ELement is:"+missingElement);
    }

    public static int missingElement(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return -1;
    }
}
