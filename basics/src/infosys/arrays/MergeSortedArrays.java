package infosys.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3; // number of valid elements in nums1
        int n = 3; // number of elements in nums2

        int[] result = mergeSortedArrays(nums1, nums2, m, n);
        System.out.println(Arrays.toString(result));
    }

    public static int[] mergeSortedArrays(int[] nums1, int[] nums2, int m, int n) {
        int[] result = new int[m + n];
        int i = 0; // pointer for nums1 (0..m-1)
        int j = 0; // pointer for nums2 (0..n-1)
        int k = 0; // pointer for result

        // Merge while both arrays have elements
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        // Copy remaining elements from nums1 (if any)
        while (i < m) {
            result[k++] = nums1[i++];
        }

        // Copy remaining elements from nums2 (if any)
        while (j < n) {
            result[k++] = nums2[j++];
        }

        return result;
    }
}