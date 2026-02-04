package day19;
import java.util.*;

public class IntersectionOfTwoArrays_OP {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] result = intersect(nums1, nums2);
        System.out.println(Arrays.toString(result));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {

        int[] small = nums1.length < nums2.length ? nums1 : nums2;
        int[] large = nums1.length < nums2.length ? nums2 : nums1;

        HashMap<Integer, Integer> map = new HashMap<>();

        // Store frequency of smaller array
        for (int num : small) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] temp = new int[small.length];
        int k = 0;

        // Match elements from larger array
        for (int num : large) {
            Integer count = map.get(num);
            if (count != null && count > 0) {
                temp[k++] = num;
                map.put(num, count - 1);
            }
        }

        return Arrays.copyOf(temp, k);
    }
}
