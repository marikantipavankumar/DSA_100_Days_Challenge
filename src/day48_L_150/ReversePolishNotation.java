package day48_L_150;

import java.util.Stack;

public class ReversePolishNotation {
    static void main() {
        String[] tokens = {"4","13","5","/","+"};
        int ans= evalRPN(tokens);
        System.out.println("ans is:"+ans);

    }

        public static int evalRPN(String[] tokens) {

            // Create a stack
            Stack<Integer> st = new Stack<>();
            // Traverse from first to last string in the given array
            for (String token : tokens) {
                if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                    int ans;
                    if (st.size() >= 2) {
                        int x1 =st.pop();
                        int x2 = st.pop();


                        ans = switch (token) {
                            case "+" -> x2 + x1;
                            case "-" -> x2 - x1;
                            case "*" -> x2 * x1;
                            default -> x2 / x1;
                        };

                        st.push((ans));
                    }

                }
                else {

                    st.push(Integer.parseInt(token));
                }
            }

            return st.pop();

        }

}
