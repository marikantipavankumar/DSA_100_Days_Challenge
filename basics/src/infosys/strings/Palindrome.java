package infosys.strings;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        int l=0,r=arr.length-1;
        while (l<=r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println("False");
              return;
            }
            l++;
            r--;

        }
        System.out.println("True");
    }
}
