package tcs_nqt_coding_qns.general;

import java.util.Scanner;

public class Lcm_OF_TWO_Num {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("LCM OF given numbers is:"+findLcm(a,b));
    }
    public static  int findLcm(int a,int b){
        return  (a*b)/findgcd(a,b);
    }

    public  static int findgcd(int a,int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;

    }
}
