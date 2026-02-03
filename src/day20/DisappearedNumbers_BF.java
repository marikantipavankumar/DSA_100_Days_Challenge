package day20;

import java.util.Arrays;
import java.util.HashSet;

public class DisappearedNumbers_BF {
   public static void main() {

       int[] nums = {1,1};
       int[] res=findDuplicates(nums);
       System.out.println("Duplicates found in the array are:"+ Arrays.toString(res));
   }
   public static int[] findDuplicates(int[] nums){
       HashSet<Integer> hs = new HashSet<>();

       // step 1: Place all the Unique elements into the Hashset

       for(int i=0;i<nums.length;i++){
           hs.add(nums[i]);
       }


       int[] res = new int[nums.length-hs.size()];
        int k=0;
       // step 2: Now compare each value from the hashset
       for(int i=1;i<=nums.length;i++){
           if(!hs.contains(i)){
               res[k]=i;
               k++;
           }
       }

       return res;
   }
}
