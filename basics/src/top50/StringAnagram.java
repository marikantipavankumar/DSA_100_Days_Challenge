package top50;

import java.util.HashMap;
import java.util.Scanner;

public class StringAnagram {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1:");
        String s = sc.nextLine();
        System.out.println("Enter the String 2:");
        String p = sc.nextLine();

        boolean ans = isAnagram(s,p);
        if(ans){
            System.out.println("Given Strings are Anagrams");
        }
        else {
            System.out.println("Given Strings are not Anagrams");
        }
    }

    static  boolean isAnagram(String s,String p){
        HashMap<Character,Integer> hm = new HashMap<>();
        char[] arr = s.toCharArray();
        for(char ch:arr){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        char[] arr2 = p.toCharArray();
        for(char ch:arr2){
            if(hm.containsKey(ch)){
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch)==0){
                    hm.remove(ch);
                }
            }
        }

        return hm.isEmpty();
    }
}
