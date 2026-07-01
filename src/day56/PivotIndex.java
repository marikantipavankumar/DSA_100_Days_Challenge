package day56;

public class PivotIndex {
    static void main() {
        int[] nums = {1,7,3,6,5,6};
        int ans = pivotIndex(nums);
        System.out.println("Pivot Index is:"+ans);
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for(int num:nums){
            totalSum+=num;
        }

        int lSum =0;
        for(int i=0;i<nums.length;i++){
            int rightSum  = totalSum-lSum-nums[i];

            if(lSum ==rightSum){
                return i;
            }

            lSum+=nums[i];
        }
        return -1;
    }
}
