package tcs_nqt_coding_qns.numberSystem;

import  java.util.*;

public class FibonacciSeries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int n1=0,n2=1;
        System.out.print(n1+" "+n2);
        for(int i=3;i<=n;i++){
            int sum = n1+n2;
            System.out.print(" "+sum);
            n1=n2;
            n2=sum;
        }

    }
}
