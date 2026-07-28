package top50;

import java.util.Scanner;

public class PrimeNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(isPrime(n)){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
    static boolean isPrime(int n){
        int i = 2;
        while(i<=Math.sqrt(n)){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
}
