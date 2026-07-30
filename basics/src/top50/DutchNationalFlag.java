package top50;

import java.util.Arrays;

public class DutchNationalFlag {
    static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2};
        int c0=0,c1=0,c2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c0++;
            }
           else if(arr[i]==1){
                c1++;
            }
           else {
               c2++;
            }
        }

        int i =0;
            while(i<c0){
                arr[i]=0;
                i++;
            }
            while(i<c1+c0){
                arr[i]=1;
                i++;
            }
            while(i<arr.length){
                arr[i]=2;
                i++;
            }
        System.out.println(Arrays.toString(arr));
    }
}
