package top50;

import java.util.Scanner;

public class Factorial {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number you want to find the factorial of a number:");
        int n = sc.nextInt();

       // int ans = findFact(n); // calling for method 1
       // System.out.println("Factorial of a given number is:"+ans);

        int fact = factRec(n);
        System.out.println("Factorial of a number by recursion:"+fact);
    }

    // Method 1: Factorial by Using Loop
    static  int findFact(int n){
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        int fact = 1;
        while(n>0){
            fact = fact*n;
            n--;
        }
        return fact;
    }

    // Method 2: Factorial by using recursion
    static int factRec(int n){
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        if(n<=1){
            return 1;
        }
        return n*factRec(n-1);
    }
}
