package top50;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class StringCompression {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s = sc.nextLine();

        String ans = stringCompression(s);
        System.out.println("Compressed String is:"+ans);
    }
    static  String stringCompression(String s){
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(s.charAt(i));
                if (count > 1) {
                    sb.append(count);
                    count=1;
                }
            }

        }
        sb.append(s.charAt(s.length()-1));
        if (count > 1) {
            sb.append(count);
        }
        return sb.toString();
    }
}
