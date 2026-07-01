package day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays_BF {
    static void main() {
        int[] nums1 = {1,2,2,1}, nums2 = {2,2};
        int[] ans = intersection(nums1,nums2);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!hs.contains(nums1[i])) {
                        list.add(nums1[i]);
                        hs.add(nums1[i]);
                    }
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}
