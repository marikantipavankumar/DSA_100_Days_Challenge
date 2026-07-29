package top50;

import java.util.Scanner;

public class CountVowels {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = countVowels(s);
        System.out.println("Number of Vowels in the given string are:"+count);
    }

    static  int countVowels(String  s){
        s=s.toLowerCase();
        char[] arr = s.toCharArray();
        int count = 0;
        for(char ch:arr){
            if((ch=='a') || (ch=='e') || (ch=='i') || (ch=='o') || (ch=='u') ){
                count++;
            }
        }
        return count;
    }
}
