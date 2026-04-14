package tcs_nqt_coding_qns.general;

import java.util.Scanner;

public class SpeedCalculation {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Distance in meters:");
        double mt = sc.nextDouble();

        System.out.print("Enter the Time in Seconds:");
        double se = sc.nextDouble();

        double speed = (mt/se) * (3.6);
        System.out.println("Speed in km/hr is: "+(int) speed);

   }
}
