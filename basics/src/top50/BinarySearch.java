package top50;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    static void main() {
        int[] arr = {2, 5, 8, 12, 16, 23, 38};
        int n = arr.length;
        int target = 38;
        int si = 0,ei=arr.length-1;
        int index = binarySearch(arr,target,si,ei);
        System.out.println("Target Index is:"+index);
    }
    static int binarySearch(int[] arr, int target, int si, int ei) {

        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, si, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, ei);
        }
    }
}
