package infosys.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
    static void main() {
        int[]arr = {5,4,5,3,2,3,1};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int[]res = new int[hs.size()];
        int i=0;
        for(int ele:hs){
            res[i]=ele;
            i++;
        }

        System.out.println(Arrays.toString(res));
    }
}
