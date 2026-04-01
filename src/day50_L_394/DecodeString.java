package day50_L_394;

import java.util.Stack;

public class DecodeString {
    public static void main(String[] args) {
        String s = "3[a]2[bc]";
        String ans = decodeString(s);
        System.out.println("Decoded String is: " + ans);
    }


    public static String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();

        StringBuilder curr = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                k = k * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(k);
                strStack.push(curr);
                curr = new StringBuilder();
                k = 0;
            }
            else if (ch == ']') {
                int count = countStack.pop();
                StringBuilder prev = strStack.pop();

                for (int i = 0; i < count; i++) {
                    prev.append(curr);
                }
                curr = prev;
            }
            else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}