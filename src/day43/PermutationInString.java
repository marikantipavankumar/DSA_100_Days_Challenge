package day43;

import java.util.HashMap;

public class PermutationInString {

    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";

        System.out.println(isPermutation(s1, s2));
    }

    public static boolean isPermutation(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> hm1 = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();

        // build hm1
        for (char c : s1.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        }

        int k = s1.length();

        // first window
        for (int i = 0; i < k; i++) {
            char c = s2.charAt(i);
            hm2.put(c, hm2.getOrDefault(c, 0) + 1);
        }

        if (hm1.equals(hm2)) return true;

        // sliding window
        for (int i = k; i < s2.length(); i++) {

            char add = s2.charAt(i);
            hm2.put(add, hm2.getOrDefault(add, 0) + 1);

            char remove = s2.charAt(i - k);
            hm2.put(remove, hm2.get(remove) - 1);

            if (hm2.get(remove) == 0) {
                hm2.remove(remove);
            }

            if (hm1.equals(hm2)) return true;
        }

        return false;
    }
}