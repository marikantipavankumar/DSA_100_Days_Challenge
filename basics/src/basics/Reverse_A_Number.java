package basics;

import java.util.Scanner;

public class Reverse_A_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int num = 0;
        while(temp>0){
            int rem=temp%10;
            num=num*10+rem;
            temp/=10;
        }

        System.out.println(num);
    }
}
