package tcs_nqt_coding_qns.numberSystem;

import java.util.*;

public class SumInRange {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values m and n:");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int sum = findInRange(m,n);
        System.out.println("Sum of numbers in range: "+sum);
    }
    public static int findInRange(int m,int n){
        if(m<0 || m>10000 || n<0 || n>10000){
            return -1;
        }

        int sum  = 0;
        if(m>n){
            int temp = m;
            m=n;
            n=temp;
        }
        for(int i=m;i<=n;i++){
            sum =sum+i;
        }
        return  sum;
    }
}

