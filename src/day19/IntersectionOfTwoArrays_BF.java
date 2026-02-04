package day19;
import java.util.*;

public class IntersectionOfTwoArrays_BF {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] resultBF = intersectBruteForce(nums1, nums2);
        System.out.println("Brute Force Result: " + Arrays.toString(resultBF));

        int[] resultOP = intersectOptimized(nums1, nums2);
        System.out.println("Optimized Result: " + Arrays.toString(resultOP));
    }

    // 🟥 Brute Force Method
    public static int[] intersectBruteForce(int[] nums1, int[] nums2) {
        boolean[] used = new boolean[nums2.length];
        int[] temp = new int[Math.min(nums1.length, nums2.length)];
        int k = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (!used[j] && nums1[i] == nums2[j]) {
                    temp[k++] = nums1[i];
                    used[j] = true;   // mark this index as used
                    break;
                }
            }
        }
        return Arrays.copyOf(temp, k);
    }

    // 🟩 Optimized Method (HashMap)
    public static int[] intersectOptimized(int[] nums1, int[] nums2) {
        int[] small = nums1.length < nums2.length ? nums1 : nums2;
        int[] large = nums1.length < nums2.length ? nums2 : nums1;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : small) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int[] temp = new int[small.length];
        int k = 0;

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
