package tcs_nqt_coding_qns.general;

import java.util.Scanner;

public class EvenOrOdd {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if((n&1)==0){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }
    }
}
