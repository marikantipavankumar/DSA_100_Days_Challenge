package recursion;

import java.util.Stack;
class Solution{

    static  void  reverseStack(Stack<Integer> st){
        if(st.isEmpty()){
            return;
        }
        int top = st.pop();
        reverseStack(st);

        insertBottom(st,top);
    }
    static void insertBottom(Stack<Integer> st,int top){
        if(st.isEmpty()){
            st.push(top);
            return;
        }

        int topVal = st.pop();
        insertBottom(st,top);
        st.push(topVal);

    }
}


public class ReverseStack {
    static void main() {
        Stack<Integer> st = new Stack<>(); // creating the stack
        st.push(4);         // Inserting the values into the stack
        st.push(1);
        st.push(3);
        st.push(2);

        Solution.reverseStack(st); // calling the reverseStack function to sort the  sort



        // Print the reversed stack
        System.out.print("Reversed Stack: ");
        while (!st.isEmpty()) {
            System.out.print(st.pop() + " ");
        }
        System.out.println();

    }
}
