package top50;

import java.util.Scanner;

public class MissingNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number to find the missing number:");
//        int n = sc.nextInt();

        int[] nums = {9,6,4,2,3,5,7,0,1};
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
        }
        int actualSum = n*(n+1)/2;
        int missingNumber = actualSum-sum;
        System.out.println("Missing Number is:"+missingNumber);
    }
}
