package tcs_nqt_coding_qns.numberSystem;

import  java.util.*;
public class GeometricProgression {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double a = sc.nextDouble();
        double r = sc.nextDouble();

        double sum = findGP(n,a,r);
        System.out.println(sum);
    }

    public static  double findGP(int n,double a,double r){
        double sum  = 0;
        double term = a;

        for(int i=1;i<=n;i++){
            sum = sum+term;
            term = term*r;
        }
        return sum;
    }
}
