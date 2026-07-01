package nla;

import java.security.SecureRandom;
import java.util.Scanner;

public class PercentageCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Math marks:");
        int maths = sc.nextInt();

        System.out.println("Enter the Biology marks:");
        int bio = sc.nextInt();

        System.out.println("Enter the hindi marks:");
        int hindi = sc.nextInt();

        System.out.println("Enter the English marks:");
        int english = sc.nextInt();

        System.out.println("Enter the Social marks:");
        int social = sc.nextInt();

        String ans = calculateEligibility(maths, bio, hindi, english, social);

        System.out.println(ans);
    }

    public static String calculateEligibility(int maths, int bio, int hindi, int english, int social) {

        if (maths < 30 || bio < 30 || hindi < 30 || english < 30 || social < 30) {
            return "fail";
        }

        int total = maths + bio + hindi + english + social;
        float percentage = (total / 500.0f) * 100;

        boolean mathEligibility = (maths >= 90 && bio >= 70 && percentage > 80);
        boolean bioEligibility = (bio >= 90 && percentage > 60);

        if (mathEligibility && bioEligibility) {
            return "JEE and Medical";
        } else if (mathEligibility) {
            return "jee";
        } else if (bioEligibility) {
            return "Medical";
        } else {
            return "fail";
        }
    }
}


