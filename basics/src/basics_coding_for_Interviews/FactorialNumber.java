package basics_coding_for_Interviews;

import java.util.Scanner;

public class FactorialNumber {
//    static void main() {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int ans=1;
//        for(int i=n;i>0;i--){
//            ans *=i;
//        }
//        System.out.println("Factorial of a given number is:"+ans);
//    }


    static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to find its factorial:");
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println("Factorial is:"+ans);
    }

    public static int factorial(int n){

        if(n==0 || n==1){
            return 1;
        }
        return n* factorial(n-1);
    }
}
