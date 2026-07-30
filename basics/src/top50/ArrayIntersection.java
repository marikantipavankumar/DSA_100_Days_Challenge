package top50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ArrayIntersection {
    static void main() {
        int[]arr1={4,9,5};
        int[] arr2 ={9,4,9,8,4};

        List<Integer> list   = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            hs.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            if(hs.contains(arr2[i])){
                list.add(arr2[i]);
                hs.remove(arr2[i]);
            }
        }

        System.out.println(list);
    }
}
