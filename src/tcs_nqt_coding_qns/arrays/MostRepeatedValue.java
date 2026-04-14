package tcs_nqt_coding_qns.arrays;

import java.util.Scanner;

public class MostRepeatedValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the values into the array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Calcuting the max Value from the Given Array:");
        int ans=0;
        int k=0;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j] ){
                    count++;
                }
            }
            if(count>ans){
                ans=count;
                k=i;
            }
        }

        System.out.println("The most repeated values number of times is:"+arr[k]+" for "+ans+" times");
    }
}
