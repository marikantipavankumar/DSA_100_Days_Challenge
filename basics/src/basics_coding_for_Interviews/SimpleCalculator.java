package basics_coding_for_Interviews;

import java.util.Scanner;

public class SimpleCalculator {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First  Number:");
        double a = sc.nextDouble();
        System.out.println("Enter The Second Number:");
        double b = sc.nextDouble();
        System.out.println("Enter the Operator:(+,-,*,/,%):");
        char operator = sc.next().charAt(0);
        double result;
        switch (operator){
            case '+':result=a+b;
            break;
            case '-':result=a-b;
            break;
            case '*':result=a*b;
            break;
            case '/':result=a/b;
            break;
            case '%':result=a%b;
            break;
            default:throw  new IllegalArgumentException("Invalid Operator");
        }
        System.out.println("result is:"+result);

    }
}
