package day45;

import java.lang.classfile.Attribute;
import java.util.Arrays;

public class NGE_BF_2 {
    static void main() {
        int[] arr = {6,8,0,1,3};
        int[] ans = nextGreater2(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] nextGreater2(int[] arr){
        int[] ans = new int[arr.length];

        for(int i = 0;i<ans.length;i++){
            ans[i]=-1;
        }

        for(int i =0;i<ans.length;i++){
            for (int j = i+1;j<ans.length;j++){
                if(arr[j]>arr[i]){
                    ans[i]=arr[j];
                    break;
                }
            }
        }
        return ans;
    }
}
