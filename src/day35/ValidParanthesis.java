package day35;

import java.util.Stack;

public class ValidParanthesis {
    static void main() {
        String s = "(]";
        boolean ans = validParanthesis(s);
        System.out.println("Given Palindrome is a valid Palindrome:"+ans);
    }
    public static  boolean validParanthesis(String s){
        // create a stack to check wheather it is a valid palindrome or not
        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch =='{' || ch=='['){
                st.push(ch);
            }
            else{
                char top = st.peek();
                if((ch==')' && top=='(' )|| (ch=='}' && top=='{')|| (ch==']'&& top=='['))
                {
                    st.pop();
                }
                else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
