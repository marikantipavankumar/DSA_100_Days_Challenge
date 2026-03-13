package day39;

import java.util.Arrays;

public class TwoSumII_BF {
    static void main() {
       int[] numbers = {2,7,11,15};
       int target = 9;

//        Input: numbers = [2,7,11,15], target = 9
//        Output: [1,2]
//        Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].

        int[] ans = findIndex(numbers,target);
        System.out.println("The indices which adds upto the given target element is:"+ Arrays.toString(ans));
    }

    public static int[] findIndex(int[] numbers,int t){

        int[] ans = new int[2];
        for(int i=0;i<numbers.length-1;i++){
            int sum = 0;
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==t){
                    ans[0]=i;
                    ans[1]=j;
                    return ans;
                }
            }
        }
        return new int[]{-1,-1};
    }
}
