package tcs_nqt_coding_qns.arrays;

public class CountPriorEle_OP {
    static void main(String[] args) {
        int[] arr = {7,4,8,2,9};
        int ans = countPrior(arr);
        System.out.println("Number of Prior Elements is:"+ans);
    }

    public  static  int countPrior(int[] nums) {


        if (nums.length == 1) {
            return 1;
        }
        int count = 1;
        int big= nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=big){
                count++;
                big = nums[i];
            }
        }

        return  count;
    }
}
