package day28;

import java.util.HashSet;

public class LongestSubString_BF {
    static void main() {
        String s = "abcabcbb";
        int n = longestSubString(s);
        System.out.println("Length of the longest sub string without repeating characters is:"+n);
    }
    public static int longestSubString(String s){
       int maxLength=0;
       for(int i=0;i<s.length();i++){
           for(int j=i;j<s.length();j++){
               if(allUnique(s,i,j)){
                   maxLength=Math.max(maxLength,j-i+1);
               }

           }
       }
       return maxLength;
    }
    public static  boolean allUnique(String s,int start,int end){
        HashSet<Character> hs = new HashSet<>();
        for(int k=start;k<end;k++){
            if(hs.contains(s.charAt(k))){
                return  false;
            }
            hs.add(s.charAt(k));
        }
        return  true;
    }
}
