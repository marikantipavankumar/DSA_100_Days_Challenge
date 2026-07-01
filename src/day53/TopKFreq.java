package day53;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TopKFreq {
    static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = topKFrequent(nums,k);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            int key = 0;
            int maxValue = Collections.max(hm.values());

            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (entry.getValue() == maxValue) {
                    key = entry.getKey();
                    break;
                }
            }

            ans[i] = key;
            hm.remove(key);
        }
        return ans;
    }
}
