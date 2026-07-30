package top50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateArray {
    static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k =3;
        int[] arr = rotateArray(nums,k);
        System.out.println(Arrays.toString(arr));
    }

    static int[] rotateArray(int[] nums,int k){
        ArrayList<Integer> list  = new ArrayList<>();
        int i = 0,j=nums.length-1;

        // reversing the entire array
        while(i<=j){
            int temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        // now reversing the first k elements again

        int m = 0;int n = k-1;
        while(m<=n){
            int temp = nums[m];
            nums[m]=nums[n];
            nums[n]=temp;
            m++;
            n--;
        }
        return nums;
    }
}
