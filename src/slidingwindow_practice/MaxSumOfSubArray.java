package slidingwindow_practice;

public class MaxSumOfSubArray {
    static void main() {
        int[] arr= {2,1,5,3,2};
        int k = 3;
        int max_sum =  findMaxSumSubArray(arr,k);
        System.out.println("Max_Sum from the given sub arrays are:"+max_sum);
    }
    public  static  int findMaxSumSubArray(int[] arr,int k){
        // first fix the size of the sliding window
        int sum  = 0,max_sum = 0;
        int l = 0;
        for(int r=0;r<k;r++){
            sum = sum + arr[r];
        }

        for(int r=k;r<arr.length;r++){
            sum = sum+arr[r]-arr[l];
            max_sum = Math.max(sum,max_sum);
            l++;
        }
        return max_sum;
    }
}
