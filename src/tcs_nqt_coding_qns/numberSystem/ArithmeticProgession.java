package tcs_nqt_coding_qns.numberSystem;

import  java.util.*;
public class ArithmeticProgession {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int cd = sc.nextInt();

        int sum = findSum(n,a,cd);
        System.out.println(sum);
    }

    public static int findSum(int n,int a,int cd){
        int count = 0;
        int ans = 0;

        for(int i=1;i<=n;i++){
            if(i==1){
                count =a;
            }
            else{
                count+=cd;
            }
            ans+=count;
        }
        return ans;
    }
}
