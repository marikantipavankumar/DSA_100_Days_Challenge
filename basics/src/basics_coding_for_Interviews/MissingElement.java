package basics_coding_for_Interviews;

import java.util.Scanner;

public class MissingElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();
        int[] arr = new int[n-1];
       for(int i=0;i<n-1;i++){
           arr[i]=sc.nextInt();
       }

        int aSum = n*(n+1)/2;
        int tSum = 0;
        for(int i=0;i<n-1;i++){
            tSum =tSum+arr[i];
        }
        int req = aSum-tSum;
        System.out.println("Missing Element is:"+req);
    }
}
