package basics;

import java.util.Arrays;

public class MergeTwoArrays {
    static void main() {
        int[]arr1 = {1,2,3};
        int[]arr2={4,5,6};
        int[]merged = new int[arr1.length + arr2.length];

        /* Approach 1
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            merged[count]=arr1[i];
            count++;
        }
        for(int i=0;i<arr2.length;i++){
            merged[count]=arr2[i];
            count++;
        }
        */

        // Approach 2
        System.arraycopy(arr1,0,merged,0,arr1.length);
        System.arraycopy(arr2,0,merged,arr1.length,arr2.length);

        System.out.println(Arrays.toString(merged));
    }
}
