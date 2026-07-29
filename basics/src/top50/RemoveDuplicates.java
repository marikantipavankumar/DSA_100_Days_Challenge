package top50;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements into the array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int size = removeDuplicates(arr);
        System.out.println("Size of the Unique elements is:"+size);

    }

    // this is not the optimized approach
    /*
    static  int removeDuplicates(int[]arr){

        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        int[] temp = new int[hs.size()];
        int i=0;
        for(int ele:hs){
            temp[i]=ele;
            i++;
        }

        Arrays.sort(temp);
        for(int j=0;j<temp.length;j++){
            arr[j]=temp[j];
        }
        System.out.println(Arrays.toString(temp));
        return temp.length;
    }
    */

    static int removeDuplicates(int[] arr) {

        if (arr.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[j] != arr[i]) {
                arr[++j] = arr[i];
            }

        }

        return j + 1;
    }
}
