package infosys.prefixSum_HashMap;

import java.util.HashMap;

public class ContinuosSubArraySum {
    static void main() {
        int []arr = {23,2,4,6,7};
        int target = 6;

        System.out.print(findSum(arr,target));
    }
    public static  boolean findSum(int[]arr,int target){
        int l=0,sum = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int r=0;r<arr.length;r++){
            sum = sum+arr[r];
            int rem = sum%target;
            if(hm.containsKey(rem) ){
                if(r-hm.get(rem)>=2) {
                    return true;
                }
            }
            else{
                hm.put(r,rem);
            }
        }
        return false;
    }
}
