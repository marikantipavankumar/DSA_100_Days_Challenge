package top50;
import java.util.Scanner;

public class Sum_Of_Digits {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = digitCount(n);
        System.out.println("Sum  of digits in a given number is:"+count);
    }
    static  int digitCount(int n ){
        int count = 0;
        while(n>0){
            int rem = n%10;
            count=count+rem;
            n=n/10;
        }
        return count;
    }
}
