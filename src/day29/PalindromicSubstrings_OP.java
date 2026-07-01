package day29;

public class PalindromicSubstrings_OP {

    public static void main(String[] args) {
        String s = "aaa";
        int count = countPalindromes(s);
        System.out.println("Total palindromic substrings: " + count);
    }

    public static int countPalindromes(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindromes
            count += expandAroundCenter(s, i, i);

            // Even length palindromes
            count += expandAroundCenter(s, i, i + 1);
        }

        return count;
    }

    public static int expandAroundCenter(String s, int left, int right) {
        int count = 0;

        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {

            count++;
            left--;
            right++;
        }

        return count;
    }
}