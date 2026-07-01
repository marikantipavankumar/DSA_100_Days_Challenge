package tcs_nqt_coding_qns.arrays;

import  java.util.*;
public class SecondLargestinArray {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int max= Integer.MIN_VALUE;
        int sMax=max;
        int ans = max;
        for(int i=0;i<arr.length;i++){

           if(ans>sMax && ans<max){
               sMax=ans;
           }
           ans = max;
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(sMax);
    }


}
