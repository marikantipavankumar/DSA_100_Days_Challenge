package sorting_problems;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {

        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original Array : " + Arrays.toString(arr));

        divide(arr, 0, arr.length - 1);

        System.out.println("Sorted Array   : " + Arrays.toString(arr));
    }

    // Divide the array into two halves
    public static void divide(int[] arr, int si, int ei) {

        // Base condition
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;

        // Sort left half
        divide(arr, si, mid);

        // Sort right half
        divide(arr, mid + 1, ei);

        // Merge both sorted halves
        conquer(arr, si, mid, ei);
    }

    // Merge two sorted halves
    public static void conquer(int[] arr, int si, int mid, int ei) {

        int[] merged = new int[ei - si + 1];

        int ind1 = si;       // Pointer for left half
        int ind2 = mid + 1;  // Pointer for right half
        int x = 0;           // Pointer for merged array

        // Compare elements from both halves
        while (ind1 <= mid && ind2 <= ei) {

            if (arr[ind1] <= arr[ind2]) {
                merged[x++] = arr[ind1++];
            } else {
                merged[x++] = arr[ind2++];
            }
        }

        // Copy remaining elements from left half
        while (ind1 <= mid) {
            merged[x++] = arr[ind1++];
        }

        // Copy remaining elements from right half
        while (ind2 <= ei) {
            merged[x++] = arr[ind2++];
        }

        // Copy merged array back into original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }

        // Print the array after every merge (for learning)
        System.out.println(
                "Merged [" + si + "," + mid + "] & [" + (mid + 1) + "," + ei + "] : "
                        + Arrays.toString(arr)
        );
    }
}