package tcs_nqt_coding_qns.arrays;

import java.util.*;

public class MostRepeatedValue_OP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // ❌ no prompt in TCS
        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        findMaxValue(arr);
    }

    public static void findMaxValue(int[] arr){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int val : arr){
            hm.put(val, hm.getOrDefault(val, 0) + 1);
        }

        int maxFreq = 0;
        int result = 0;

        for(int val : hm.keySet()){
            if(hm.get(val) > maxFreq){
                maxFreq = hm.get(val);
                result = val;
            }
        }

        System.out.println(result);
    }
}