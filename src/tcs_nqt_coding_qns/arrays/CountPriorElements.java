package tcs_nqt_coding_qns.arrays;

public class CountPriorElements {
    static void main(String[] args) {
        int[] arr = {7,4,8,2,9};
        int ans = countPrior(arr);
        System.out.println("Number of Prior Elements is:"+ans);
    }

    public  static  int countPrior(int[] nums){


        if(nums.length==1){
            return 1;
        }

        int count = 0;

        for(int i=0;i<nums.length;i++){
            boolean found=true;
            for(int j=0;j<=i;j++){
                if(nums[j]>nums[i]){
                  found=false;
                }
            }
            if(found){
                count++;
            }
        }
        return count;
    }
}
