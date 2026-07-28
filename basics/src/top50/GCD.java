package top50;

import java.util.Scanner;

public class GCD {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = findGCD(a,b);
        int lcm = findLCM(a,b);
        int gcd_By_Euclidean= gcd_By_Euclidean(a,b);

        System.out.println("GCD of given numbers is:"+gcd);
        System.out.println("Found GCD by Eucliden algorithm:"+gcd_By_Euclidean);

        System.out.println("LCM of given numbers is:"+lcm);

    }

    public static  int findGCD(int a ,int b){
        int  i = Math.min(a,b);
        while(i>=1){
            if(a%i==0 && b%i==0){
                return i;
            }
            i--;
        }
        return -1;
    }

    static  int findLCM(int a,int b){
        int gcd = findGCD(a,b);
        int lcm = (a*b)/gcd;
        return lcm;
    }

    // recursively divide the one number with another number untill it becomes 0,
    // then the remainig number will be the answer(gcd).

    static int gcd_By_Euclidean(int a,int b){
        if(b==0){
            return a;
        }
        return gcd_By_Euclidean(b,a%b);

    }
}
