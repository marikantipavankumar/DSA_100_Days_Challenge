package infosys.arrays;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[]arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max= Integer.MIN_VALUE;
        int s_max=max;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                s_max= max;
                max = arr[i];
            }
            else if(arr[i]>s_max && arr[i]<max){
                s_max=arr[i];
            }
        }
        System.out.print(s_max);
    }
}
