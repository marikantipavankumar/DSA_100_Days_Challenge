package day60;

import java.util.HashSet;

public class LongestNiceString {
    public static void main(String[] args) {
        String s = "YazaAay";
        String ans = longestNiceSubstring(s);
        System.out.println("answer is: " + ans);
    }

    public static String longestNiceSubstring(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String sub = s.substring(i, j);

                if (isNice(sub) && sub.length() > result.length()) {
                    result = sub;
                }
            }
        }
        return result;
    }

    public static boolean isNice(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (char ch : s.toCharArray()) {
            if (Character.isLowerCase(ch) && !set.contains(Character.toUpperCase(ch))) {
                return false;
            }
            if (Character.isUpperCase(ch) && !set.contains(Character.toLowerCase(ch))) {
                return false;
            }
        }

        return true;
    }
}