package day28;

import java.util.HashMap;

public class LongestSubString_OP {
    static void main() {
        String s = "abcabcbb";
        int n = longestSUbString(s);
        System.out.println("Longest substring of given string is:"+n);
    }
    public static int longestSUbString(String s){
        int maxLength=0;
        HashMap<Character,Integer>hm = new HashMap<>();
        int left=0;
        for(int right=0;right<s.length();right++){
           if(hm.containsKey(s.charAt(right))){
               left=Math.max(left,hm.get(s.charAt(right))+1);
           }
           hm.put(s.charAt(right),right);
           maxLength=Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}

