package tcs_nqt_coding_qns.bitManipulation;

import java.util.Scanner;

public class FlipBits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Value you wanted to flip:");
        int n = sc.nextInt();

        int ans = flipBits(n);
        System.out.println("Integer value after flipping the bits is:"+ans);
    }
    public  static  int flipBits(int n){
        int bits = Integer.toBinaryString(n).length();

        int mask = (1<<bits)-1;

        return n ^ mask;
    }
}
