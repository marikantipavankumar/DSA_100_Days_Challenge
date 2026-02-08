package day20;

import java.util.ArrayList;
import java.util.List;

public class DisappearedNumbers_OP {
   public static void main() {

       int[] nums = {1,1};
       List<Integer> res=findDisappearedNumbers(nums);
       System.out.println("Disappeared Elements are:"+res);
   }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            int index  = nums[i]-1;
            if(nums[index]<0){
                continue;
            }

            nums[index]*=-1;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                list.add(i+1);
            }
        }
        return list;
   }
}
