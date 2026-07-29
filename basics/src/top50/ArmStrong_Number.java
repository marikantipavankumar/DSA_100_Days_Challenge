package top50;

import java.util.Scanner;

// An armstrong number is a number that is digits raised to the ower of count of
// total digits is equal to given number; 153 => (1**3) + (5**3) + (3**3) = 153

public class ArmStrong_Number {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is a armstrong number or not:");
        int n = sc.nextInt();

        boolean ans = checkArmStrong(n);
        if(ans){
            System.out.println("Given number is an armstrong number");
        }
        else{
            System.out.println("Given number is  not an armstrong number");
        }
    }

    static  boolean checkArmStrong(int n){
        // First count the number of digits in a given number
        int temp = n;
        int count = 0;
        while(temp>0){
            count=count+1;
            temp=temp/10;
        }

        // extract  each digit and power it

        int sum = 0;
        int k = n;
        while(k>0){
            int rem = k%10;
            sum =sum+(int)Math.pow(rem,count);
            k=k/10;
        }

        if(n==sum){
            return true;
        }

        return false;
    }
}
