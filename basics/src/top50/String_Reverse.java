package top50;
import java.util.Arrays;

public class String_Reverse {
    public static void main(String[] args){
        String s = "Pavan Marikanti";

       // String rev = reverseString(s);  // Approach 1: to solve by using string builder

        String rev = stringRev(s);  // Approach 2: to solve by using the character array

        System.out.println("Reversed String is:"+rev);
    }

    // method 1 -- by using the string builder
    static String reverseString(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();
        return rev;
    }

    // method 2 -- by using char array and  two pointers without using the built in functions
    static  String stringRev(String  s){
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length-1;
        while (l <= r){
            char temp = arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        return new String(arr);
    }

}
