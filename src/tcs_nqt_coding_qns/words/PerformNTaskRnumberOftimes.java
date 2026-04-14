package tcs_nqt_coding_qns.words;

import java.util.Scanner;

public class PerformNTaskRnumberOftimes {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n = sc.nextInt();

        System.out.print("Enter the value of R:");
        int r = sc.nextInt();
        int ans = findAns(n,r);
        System.out.println("N digits are Summed and Multiplied for R number of times then answers is:"+ans);

    }

    public static  int findAns(int n,int r){
        if(r==0 || n==0){
            return 0;
        }

        int ans = 0;
        while(n!=0){
            int rem = n%10;
            ans = ans+rem;
            n=n/10;
        }

        ans=ans*r;

        int sum = 0;
        while(ans!=0){
            int rem = ans%10;
            sum=sum+rem;

            ans =ans/10;
        }
        return sum;
    }
}
