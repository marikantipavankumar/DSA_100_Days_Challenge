package day59;

import java.util.HashMap;

public class CheckIfAllOccurancesAreSame {
    static void main() {
        String s = "abbcbc";
        boolean ans = areOccurrencesEqual(s);
        System.out.println("All Occurances are Same:"+ans);
    }
    public static boolean areOccurrencesEqual(String s) {

        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int count = hm.get(s.charAt(0));

        for(int value:hm.values()){
            if(value!=count){
                return false;
            }
        }

        return true;
    }
}
