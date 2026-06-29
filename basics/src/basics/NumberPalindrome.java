package basics;

import java.util.Scanner;

public class NumberPalindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int ans = 0;
        while(n>0){
            int rem = n%10;
            ans = ans*10+rem;
            n=n/10;
        }

        if(ans==temp){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
