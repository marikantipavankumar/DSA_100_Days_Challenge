package tcs_nqt_coding_qns.general;
import java.util.*;

public class ParkingCharges {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double amount=0;
        if(n<=0){
            System.out.println("Error");
            return;
        }
        else if(n<=2){
             amount = n * 100;
        }
        else if(n>2 && n<=5){
            double hrs = n-2;
            amount=2 * 100 + (n-2)*50;
        }
        else{
            double hrs = n-5;
            amount = (2 * 100) + (3*50)+(hrs*20);
        }

        System.out.println(amount);
        sc.close();
    }
}
