package basics_coding_for_Interviews;

import java.util.Scanner;

public class PrimeNumbersInRange {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();
        int count = 0;
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                count++;
            }
        }
        System.out.println("The Number of Prime Numbers in a range is:"+count);
        }
    private static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for(int i=2;i<=n/2;i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}