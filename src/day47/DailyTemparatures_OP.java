package day47;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class DailyTemparatures_OP {
    static void main() {
        int[] temperatures = {30,60,90};
        int[] ans = findTemp(temperatures);
        System.out.println("next greater element is:"+Arrays.toString(ans));
    }
    public static int[] findTemp(int[] temp){
//        HashMap<Integer,Integer> hm = new HashMap<>();
//        Stack<Integer> stack = new Stack<>();
//        int[] ans = new int[temperatures.length];
//
//        int top = -1;
//        for(int i=temperatures.length-1;i>=0;i--) {
//
//            int count = 0;
//            hm.put(temperatures[i],i);
//            while (!stack.isEmpty() && (stack.peek()<temperatures[i])) {
//                stack.pop();
//                top--;
//            }
//
//            while(!stack.isEmpty() && (stack.peek()==temperatures[i])){
//                stack.pop();
//            }
//
//            if (!stack.isEmpty() && (stack.peek() > temperatures[i])) {
//
//
//                int ele = stack.peek();
//                count=hm.get(ele)-i;
//            }
//            ans[i]=count;
//            stack.push(temperatures[i]);
//            top++;
//        }
//        return ans;
//    }

        int[] ans = new int[temp.length];
        Stack<Integer> st = new Stack<>();
        for(int i = temp.length-1;i>=0;i--){
            while(!st.isEmpty() && (temp[st.peek()]<=temp[i])){
                st.pop();
            }

            if(!st.isEmpty()){
                ans[i]=st.peek()-i;
            }
            st.push(i);
        }
        return ans;
    }
}