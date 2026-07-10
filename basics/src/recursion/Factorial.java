package recursion;

import java.util.Optional;

public class Factorial {
    static void main() {
        int n =5;
        int fact = factorial(n);
        System.out.println("Factorial of a Given Number is:"+fact);
    }
    public static int factorial(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
