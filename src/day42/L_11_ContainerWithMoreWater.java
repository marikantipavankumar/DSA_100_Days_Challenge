package day42;

public class L_11_ContainerWithMoreWater {
    static void main() {
        int[] arr= {1,8,6,2,5,4,8,3,7};
        int ans = containerWithMostWater(arr);
        System.out.println("Container  can hold the max water is:"+ans);
    }

    public static int containerWithMostWater(int[] nums){
        int l =0;
        int r =nums.length-1;
        int max=0;
        while(l<r){
            int area =Math.min(nums[l],nums[r])*(r-l);
            max=Math.max(area,max);

            if(nums[l]<nums[r]){
                l++;
            }
            else {
                r--;
            }
        }

        return max;


    }
}
