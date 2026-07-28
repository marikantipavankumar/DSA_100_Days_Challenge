package top50;

import java.util.Scanner;

public class Fibonacci_Series {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n to print fibonacci series of first n numbers from start");
        int n = sc.nextInt();
        printFib(n);
    }

    static void printFib(int n){
        if(n==1 || n==0){
            System.out.println(0);
            return;
        }
        if(n==2 ){
            System.out.println(0 +" "+1);
        }

        if(n>2){
            int first  = 0;
            int second = 1;
            int i=2;
            System.out.print(0 +" "+1+" ");
            while(i<n){
                int third = first +second;
                System.out.print(third+" ");
                first = second;
                second=third;


                i++;
            }
        }

    }
}
