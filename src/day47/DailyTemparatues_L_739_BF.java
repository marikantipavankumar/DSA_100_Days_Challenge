package day47;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DailyTemparatues_L_739_BF {
    static void main() {
        int[] temperatures = {73,74,75,71,69,72,76,73};
        int[] ans = findTemp(temperatures);
        System.out.println("Next Temparature for each day is:"+ Arrays.toString(ans));
    }
    public static int[] findTemp(int[] temparatures){
        int[] ans = new int[temparatures.length];

        for(int i=0;i<temparatures.length;i++){
            int count=1;
            for(int j=i+1;j<temparatures.length;j++){
                if(temparatures[j]>temparatures[i]){
                    ans[i]=count;
                    break;
                }
                count++;
            }
        }
        return ans;
    }
}
