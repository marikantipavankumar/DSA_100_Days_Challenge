package top50;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements into the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target sum:");
        int target = sc.nextInt();

        int[]res = find_Two_Sum(arr,target);
        System.out.println(Arrays.toString(res));

    }

    static  int[] find_Two_Sum(int[]arr,int target){
        int[] res = new int[2];
        HashMap<Integer,Integer> hm  = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int req = target-arr[i];
            if(hm.containsKey(req)){
                res[0]=hm.get(req);
                res[1]=i;
                return res;
            }
            hm.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
