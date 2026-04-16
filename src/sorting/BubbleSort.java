package sorting;

import java.util.*;

public class BubbleSort {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] sort= sortArray(arr);
        System.out.println(Arrays.toString(sort));
    }
    public  static  int[] sortArray(int[] arr){
        int n = arr.length-1;
        for(int i=n;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
