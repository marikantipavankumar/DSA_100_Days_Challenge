package tcs_nqt_coding_qns;

import java.util.*;
public class MissingNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }
        int n = arr.length+1;
        int sum = n * (n+1)/2;
        int total=0;
        for(int val:arr){
            total+=val;
        }

        int req = sum-total;
        System.out.println(req);
    }
}
