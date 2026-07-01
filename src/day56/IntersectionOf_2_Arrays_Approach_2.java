package day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOf_2_Arrays_Approach_2 {
    static void main() {
        int[] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public  static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {

            hs.add(nums1[i]);

        }

        for(int i=0;i<nums2.length;i++){
            if(hs.contains(nums2[i])){
                list.add(nums2[i]);
                hs.remove(nums2[i]);
            }
        }


        int[] arr = new int[list.size()];
        for(int i = 0;i<list.size();i++)
        {
            arr[i] = list.get(i);
        }return arr;
    }
}
