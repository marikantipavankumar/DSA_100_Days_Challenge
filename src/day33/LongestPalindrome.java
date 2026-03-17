package day33;

import java.util.HashMap;

public class LongestPalindrome{
    public static void main(String[] args) {

        String s="ccc";
        int len = longestPalindrome(s);
        System.out.println("Longest Palinfrome can be built using the above Characters are:"+len);
    }
    public static int longestPalindrome(String s) {
        if(s.length()==1||s.length()==0){
            return s.length();
        }
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int length=0;
        boolean oddFound=false;

        for(int i:hm.values()){
            if(i%2==0){
                length=length+i;
            }
            else{
                length+=i-1;
                oddFound=true;
            }
        }

       if(oddFound){
           length+=1;
       }
        return length;
    }
}

