package day45;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class NextGreaterEle_I_OP {
    static void main() {
        int[] nums1={4,1,2};
        int[] nums2={1,3,4,2};
        int[] ans = nextGreaterElement(nums1,nums2);
        System.out.println("The Resultant array is:"+ Arrays.toString(ans));
    }

    public static int[] nextGreaterElement(int[] nums1,int[] nums2){
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] ans = new int[nums1.length];

        for(int i =0;i<ans.length;i++){
            ans[i]=-1;
        }
        // iterating from right to left
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                st.pop();
            }

            if(st.isEmpty()){
                ans[i]=-1;
            }
            else ans[i]=st.peek();
            hm.put(nums2[i],ans[i]);
            // pus current element into the stack

            st.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for(int i =0;i<res.length;i++){
            res[i]=hm.get(nums1[i]);
        }
        return res;
    }
}
