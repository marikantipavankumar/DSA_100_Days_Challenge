package tcs_nqt_coding_qns.permutation;

import java.util.Scanner;

public class SeatingArranement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Total number of members attending the meeting:");
        int n = sc.nextInt();
        int ans = findPermutation(n);
        System.out.println(ans +" -> Possible ways of seating the members");
    }

    public static  int findPermutation(int n){
        int ans = 2*factorial(n-1);
        return ans;
    }
    public static int factorial(int n){

        if(n==0 || n==1){
            return 1;
        }
         return n*factorial(n-1);
    }
}
