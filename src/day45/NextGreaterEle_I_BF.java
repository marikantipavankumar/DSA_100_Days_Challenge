package day45;

import java.util.Arrays;

public class NextGreaterEle_I_BF {
    static void main() {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        int[] ans = nextGreaterElement(nums1,nums2);
        System.out.println("The Resultant array is:"+ Arrays.toString(ans));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            int j=0;
            boolean found = false;
            boolean curr = false;
            while(j<nums2.length){
                if(nums1[i]==nums2[j]){
                    curr=true;
                    j++;
                    continue;
                }
                if((nums2[j]>nums1[i]) && (curr)){
                    ans[k]=nums2[j];
                    k++;
                    found=true;
                    break;
                }
                j++;
            }
            if(found==false){
                ans[k]=-1;
                k++;
            }
        }
        return ans;

    }
}
