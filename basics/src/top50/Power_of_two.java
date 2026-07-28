package top50;

import java.util.Scanner;

public class Power_of_two {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number you want to find the power of two");
        int n = sc.nextInt();

        boolean ans = isPower(n);
       if(ans){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }
    }
    static  boolean isPower(int n){
        if(n<1){
            return false;
        }
        while (n>1){
            if(n%2!=0){
                return false;
            }
            n=n/2;
        }
        return true;
    }
}
