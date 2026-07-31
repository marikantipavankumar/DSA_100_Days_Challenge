package top50;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthLargest_Element {
    static void main() {
        int[] arr = {7,10,4,3,20,15};
        int k  = 4;

       // int ans = findKthLargest(arr,k);
        // System.out.println("The Kth Largest Element is:"+ans);

        // Optimized Approach
        int ans = findKthLargest_OP(arr,k);
        System.out.println("The Kth Largest ELement is found by Optimized Approach is:"+ans);
    }

    // brute force approach
    static int findKthLargest(int[] arr,int k){
        Arrays.sort(arr);
        int idx = arr.length-k;
       return arr[idx];
    }

    // optimized approach - using PriorityQueue(which internally uses min heap approach)
    static int findKthLargest_OP(int[]arr,int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {

            pq.offer(arr[i]);
            if (pq.size() > k) {
                pq.poll();
            }

        }

        return pq.peek();
    }
}
