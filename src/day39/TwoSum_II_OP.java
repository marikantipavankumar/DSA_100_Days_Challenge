package day39;

import java.util.Arrays;

public class TwoSum_II_OP {
    static void main() {

        int[] numbers = {2,3,4};
        int target = 6;

//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

        int[] ans = findIndex(numbers,target);
        System.out.println("The indices which adds upto the given target element is:"+ Arrays.toString(ans));
    }
    public static int[] findIndex(int[] numbers,int target){
        int l=0;
        int r= numbers.length-1;
        int[] ans = new int[2];
        while (l<=r){
            int sum = numbers[l]+numbers[r];
            if(sum==target){
                ans[0]=l+1;
                ans[1]=r+1;
                return ans;
            }
            else if(sum>target){
                r--;
            }
            else {
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}
