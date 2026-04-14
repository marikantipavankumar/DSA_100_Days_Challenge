package tcs_nqt_coding_qns.arrays;

import java.util.Arrays;

public class MoveZeros_TO_End {
    static void main() {
        int[] arr = {6,0,1,8,0,2};

        int[] result = moveZeros(arr);
        System.out.println("Result Array is:"+ Arrays.toString(result));
    }
    public  static int[] moveZeros(int[] nums){
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                continue;
            }
            else{

                nums[i]=nums[j];
                i++;
            }
        }

        while(i<nums.length){
            nums[i]=0;
            i++;
        }
        return nums;
    }
}
