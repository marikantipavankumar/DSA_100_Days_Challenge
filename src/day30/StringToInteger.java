package day30;

public class StringToInteger {

    public static void main(String[] args) {
        String s = "-1q42";
        int ans = convertStringToInt(s);
        System.out.println("Converted String to Integer is: " + ans);
    }

    public static int convertStringToInt(String s) {
        int i = 0;
        int n = s.length();
        int sign = 1;
        long num = 0;

        // Skip spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Handle sign
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        // Process digits
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');

            if (sign * num > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (sign * num < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;
        }

        return (int)(sign * num);
    }
}