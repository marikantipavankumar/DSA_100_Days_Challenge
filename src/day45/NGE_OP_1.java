package day45;

import java.util.Stack;
import java.util.Arrays;

public class NGE_OP_1 {
    static void main() {
        int[] arr = {6,8,0,1,3};
        int[] ans = nextGreaterOP(arr);
        System.out.println("Next Greater element fro each element is:"+ Arrays.toString(ans));
    }

    public static int[] nextGreaterOP(int[] arr){
        int[] ans = new int[arr.length];

        // intialize all the values in a given array to -1;
        for(int i =0;i<ans.length;i++){
            ans[i]=-1;
        }

        // Create a Stack;
        Stack<Integer> st = new Stack<>();

        // iterating from right to left
        for(int i=ans.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=-1;
            }
            else ans[i]=st.peek();
            // pus current element into the stack

            st.push(arr[i]);
        }
        return ans;
    }
}
