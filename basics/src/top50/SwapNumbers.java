package top50;

import java.util.Scanner;

public class SwapNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First Number:");
        int first = sc.nextInt();
        System.out.println("Enter the Second Number:");
        int second= sc.nextInt();

        swapNumbers(first,second);
    }

    // Swapping Numbers without using the Third Variable
    static void swapNumbers(int a,int b){
        System.out.println("Numbers before swapping ,a = "+a+" b = "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Numbers after swapping ,a = "+a+" b = "+b);


    }
}
