package day25;

public class FirstOccuranceOfString_OP {

    public static void main(String[] args) {
        String haystack = "bdsadbutsad";
        String needle = "sad";

        int result = strStr(haystack, needle);

        System.out.println("Index: " + result);
    }

    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        int[] lps = buildLPS(needle);

        int i = 0; // pointer for haystack
        int j = 0; // pointer for needle

        while (i < haystack.length()) {

            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                if (j == needle.length()) {
                    return i - j; // match found
                }
            } else {
                if (j != 0) {
                    j = lps[j - 1]; // jump using LPS
                } else {
                    i++;
                }
            }
        }

        return -1;
    }

    private static int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}