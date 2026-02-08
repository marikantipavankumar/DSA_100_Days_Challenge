package day20;

import java.util.ArrayList;
import java.util.List;

public class DisappearedElements_BF {
  public   static void main() {
      int[] nums = {1,4,3,2,6,8,9,7,7};
      List<Integer> res=findDisappearedNumbers(nums);
      System.out.println("Disappeared Elements are:"+res);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums){
      List<Integer> list = new ArrayList<>();

      for(int i=1;i<=nums.length;i++){
          boolean found = false;
          for(int j=0;j<nums.length;j++){
              if(nums[j]==i){
                  found=true;
              }
          }

          if(found==false){
              list.add(i++);
          }


      }
      return list;
    }
}
