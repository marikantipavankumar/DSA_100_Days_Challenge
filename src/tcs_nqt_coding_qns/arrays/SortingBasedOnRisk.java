package tcs_nqt_coding_qns.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingBasedOnRisk {
    static void main() {
        int[] arr = {2,1,0,2,1,0,0,1,2,0};
        int[] result = sortArray(arr);
        System.out.println("Arrays after SOrting based on risk is:"+ Arrays.toString(result));
    }

    public  static  int[] sortArray(int[] nums){
        Arrays.sort(nums);
        return nums;
    }
}
