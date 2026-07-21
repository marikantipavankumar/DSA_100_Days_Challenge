package infosys.strings;

import java.util.Scanner;

public class Reverse_string {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
       // System.out.println();

        StringBuilder sb = new StringBuilder(s);
        System.out.println(sb.reverse().toString());
    }
}
