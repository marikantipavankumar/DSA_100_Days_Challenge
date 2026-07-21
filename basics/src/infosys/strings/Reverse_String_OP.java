package infosys.strings;

import java.util.Scanner;

public class Reverse_String_OP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        char[] arr = s.toCharArray();
        int l=0,r=arr.length-1;
        while(l<=r){
            char temp = arr[l];
            arr[l]=temp;
            arr[r]=temp;
            l++;
            r--;
        }
        System.out.print(new String(arr));

    }
}
