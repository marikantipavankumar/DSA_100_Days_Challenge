package day18;

public class MissingNumber_Op {

    public static void main(String[] args) {
        int[] nums = {9,6,4,2,3,5,7,0,1};
        int missingElement = missingNumber(nums);
        System.out.println("Missing Element is: " + missingElement);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        return expectedSum - sum;
    }
}
