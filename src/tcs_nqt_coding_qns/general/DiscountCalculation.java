package tcs_nqt_coding_qns.general;
import java.util.*;
public class DiscountCalculation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double n =sc.nextLong();
        double discount = 0;
        if(n<0 || n==0){
            System.out.println("Error");
        }
        else if(n<1000){
             discount =( 5* n)/100;

        }
        else if(n<=5000){
             discount = (10 * n)/100;

        }
        else{
             discount = (15 * n)/100;
       }
        double amount = n - discount;
        System.out.println(amount);
        sc.close();
    }

}
