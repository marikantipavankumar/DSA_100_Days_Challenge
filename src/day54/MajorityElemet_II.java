package day54;

import java.util.ArrayList;
import java.util.HashMap;

public class MajorityElemet_II {
    static void main() {
        int[] nums = {3, 2, 3};
        ArrayList<Integer> list = majorityElements(nums);
        System.out.println(list);
    }

    public static ArrayList<Integer> majorityElements(int[] nums) {

        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int n = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) > n) {
                list.add(key);
            }
        }

        return list;
    }
}