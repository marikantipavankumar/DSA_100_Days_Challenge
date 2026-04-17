package tcs_nqt_coding_qns.arrays;

import java.util.*;
public class Unknown_rotatedArray {

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the rotated sorted array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the element to search in the array:");
        int k = sc.nextInt();

        int steps = findStepsSorted(arr);
        int index = findIndex(k,arr);
        System.out.println("No of steps rotated are:"+steps+"  element k index position is:"+index);

    }
    public static int findStepsSorted(int[] arr){
        int ans =0 ;
        for(int i =1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                ans = i+1;
                break;
            }
        }
        return ans;
    }

    public static int findIndex(int k,int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
}
