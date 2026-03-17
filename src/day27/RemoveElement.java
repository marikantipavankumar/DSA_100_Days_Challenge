package day27;

import java.util.Arrays;

public class RemoveElement {
    static void main() {
        int[] nums={};
        int val = 3;
        int ans = removeElement(nums,val);
        System.out.println("The number of elements after removing the given element "+val+" is:"+ ans);

    }

    public static int removeElement(int[] nums,int val){
        if(nums.length==0 || (nums.length==1 && nums[0]==val)){
            return -1;
        }
        int[] arr = new int[nums.length];

        int k =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                arr[k]=nums[i];
                k++;
            }
        }

        int j=0;
        for(int i=0;i<=k;i++){
            nums[i]=arr[j];
        }

        System.out.println(Arrays.toString(nums));

        return k;
    }
}
