package day61;

public class NumberOfGoodPairs {
    static void main() {
        int[] nums = {1,2,3,1,1,3};
        int ans = findNumberOfGoodPairs(nums);
        System.out.println("Number of Good Pairs are" +ans);
    }

    public  static  int findNumberOfGoodPairs(int[] nums){
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && i<j){
                    count++;
                }
            }
        }

        return count;
    }
}
