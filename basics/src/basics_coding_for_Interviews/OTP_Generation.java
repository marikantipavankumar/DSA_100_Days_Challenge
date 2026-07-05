package basics_coding_for_Interviews;

import java.util.Random;
import java.util.Scanner;

public class OTP_Generation {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Random random  = new Random(); // The random() method in Java is used to generate random numbers
        int otp = 0;
        System.out.println("Creating 6 digit OTP:");
        otp=(otp*10)+random.nextInt(900000)+100000;


        System.out.println("Generated OTP is:"+otp);
        System.out.println("Enter your OTP:");
        int n = sc.nextInt();
        if(n==otp){
            System.out.println("OTP Verified:");
        }
        else{
            System.out.println("Incorrect OTP:Please try again");
        }
    }
}
