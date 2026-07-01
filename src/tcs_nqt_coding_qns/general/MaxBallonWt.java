package tcs_nqt_coding_qns.general;

import java.util.*;
class MaxBallonWt{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int wt = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(countPersons(arr,wt));
    }

    public static int countPersons(int[] arr,int wt){
        Arrays.sort(arr);
        int count = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<=wt){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}