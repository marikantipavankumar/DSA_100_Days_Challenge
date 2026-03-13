package slidingwindow_practice;

import java.util.ArrayList;
import java.util.List;

public class FirstNegativeNumber {
    static void main() {
       int[] arr = {12,-1,-7,8,-15,30,16,28};
       int k = 3;

       List<Integer> list = firstNegativeNumber(arr,k);
       System.out.println("Minimum in each subArray of size 3 is:"+list);
    }

    public static List<Integer>  firstNegativeNumber(int[] arr,int k){
        // fixing the size of the sliding window

        ArrayList<Integer> list = new ArrayList<>();

        int l=0,r;
        int firstNegative=0;
        for(r=0;r<k;r++){
            if(arr[r]<0){
                firstNegative=arr[r];
                list.add(firstNegative);
                break;
            }
        }
        for(r=k;r<arr.length;r++){
            int j = l+1;
            firstNegative=0;
            while(j<=r){
                if(arr[j]<0){
                    firstNegative=arr[j];
                    list.add(firstNegative);
                    break;
                }
                else if(j==r){
                    list.add(firstNegative);
                }
                j++;
            }
            l++;
        }
        return list;
    }
}
