package basics_coding_for_Interviews;
import  java.util.*;
public class FibonacciSeries {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find the fibonacci series till that number:");
        int n = sc.nextInt();
        int first = 0;
        int second = 1;
        for(int i=0;i<n;i++){
            int num = first+second;
            System.out.print(" "+first);
            first=second;
            second=num;
        }

    }
}
