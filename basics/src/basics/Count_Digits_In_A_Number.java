package basics;

public class Count_Digits_In_A_Number {
    static void main() {
        int a  = 12345;
        int count = String.valueOf(a).length();
        System.out.println("Total Digits in a Given Number is: "+count);
    }
}
// method to find the digits in a Number:
// String.valueOf(a).length();