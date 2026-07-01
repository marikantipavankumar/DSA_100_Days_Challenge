package day23;

import java.util.HashMap;

public class ValidAnagram_BF {

    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        boolean ans = isValidAnagram(s, t);
        System.out.println(ans);
    }

    public static boolean isValidAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> hm = new HashMap<>();

        // Count characters of s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // Reduce using t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (!hm.containsKey(ch) || hm.get(ch) == 0) {
                return false;
            }

            hm.put(ch, hm.get(ch) - 1);
        }

        return true;
    }
}
