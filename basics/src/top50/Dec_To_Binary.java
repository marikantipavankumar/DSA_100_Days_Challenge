package top50;

import java.util.Scanner;

public class Dec_To_Binary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        findBinary(n);
    }
    static  void findBinary(int n){
        StringBuilder sb = new StringBuilder();

        while(n>0){
            int rem = n%2;
            sb.append((char)('0'+rem)); // here '0' represents ascii value of 0 that is : 48 .
            // so ,we are adding remainder to 48 and then again converting back to character
            // ex: 48 +rem(1) = 49 ..(char) 49 = 1;
            n/=2;
        }

        sb.reverse();
        System.out.println("Binary String is:"+sb);
    }
}
