package recursion;

import java.util.Stack;

public class Del_Mid_Ele_From_Stack {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        System.out.print("Stack After Deleting The Mid Element:");
        int mid  = st.size()/2+1;
        delMid(st,st.size(),mid);

        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }

    static void delMid(Stack<Integer> st,int size,int mid){
        if(size==mid){
            st.pop();
            return;
        }

        int top = st.pop();
        delMid(st,size-1,mid);
        addTop(st,top);
    }
    static void addTop(Stack<Integer>st,int top){
        st.push(top);
    }
}
