package day55;

public class RemoveDuplicatesFromSortedArray_II {
    static void main() {
        int[] nums = {1,1,1,2,2,3};
        int ans = removeDuplicates(nums);
        System.out.println(ans);
    }


    public static int removeDuplicates(int[] nums) {
        if (nums.length == 2) {
            return nums.length;
        }

        int i = 2;
        for (int j = 2; j < nums.length; j++) {
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;

    }
}