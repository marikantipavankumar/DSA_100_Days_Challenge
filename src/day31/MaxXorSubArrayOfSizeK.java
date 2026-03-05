package day31;

public class MaxXorSubArrayOfSizeK {
    static void main() {
        int[] arr = {17,11,11,14,1,17,19,14,6,4,6,17};
        int k=6;
        int maxSum = maxSumSubArray(arr,k);
        System.out.println("maxSum of the given sub Array:"+maxSum);
    }
    public static int maxSumSubArray(int[] arr,int k){
        int l=0;
        int high=0,ans=0;
        for(int r=0;r<arr.length;r++){

            ans=ans^arr[r];
            if((r-l)+1>k){
                ans=ans^arr[l];
                l++;

            }

            if((r-l+1)==k) {
                high = Math.max(high, ans);
            }
        }
        return high;
    }
}
