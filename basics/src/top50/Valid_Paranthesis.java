package top50;

import java.util.Stack;

public class Valid_Paranthesis {
    static void main() {
        String s = "[[()]]";
        boolean ans = isValid(s);
        if (ans) {
            System.out.println("Valid Parenthesis:" + ans);
        } else {
            System.out.println("Valid Paranthesis:" + ans);
        }

    }

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
        while (i < s.length()) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {

                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if( (ch==')' && top!='(') || (ch==']' && top!='[') || (ch=='}' && top!='{')){
                    return false;
                }
            }
            i++;

        }
        return st.isEmpty();
    }
}
