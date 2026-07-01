package day22;

public class ReverseString_OP {

    static void main() {
        char[] str ={'H','E','E','L','O'};
        reverseString(str);
    }

    public static void reverseString(char[] str) {
        int n = str.length;

        int l = 0;
        int r = n - 1;

        while (l < r) {
            char ch = str[l];
            str[l] = str[r];
            str[r] = ch;
            l++;
            r--;
        }
        System.out.println(str);

    }
}
