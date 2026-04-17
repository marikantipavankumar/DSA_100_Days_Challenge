package slidingwindow_practice;

import  java.util.*;
public class FindMax {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[] sol = findMax(arr,k);
        System.out.println(Arrays.toString(sol));
    }

    public  static  int[] findMax(int[] arr,int k){
        int n = arr.length;
        int[] sol = new int[n];

        for(int i=0;i<=n-k;i++){
            int j=i;
            int max=arr[i];

            while(j<=i+k-1){
                if(arr[j]>max){
                    max=arr[j];
                }
                j++;
            }
            sol[i]=max;
        }
        return sol;
    }
}
