package day61;

import java.util.HashMap;

public class PangramChecking {
    static void main() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = isPangram(sentence);

        System.out.println("IS Pangram:"+ans);
    }
    public static boolean isPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            int k = (int)ch;
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i=97;i<=122;i++){
            char ch = (char) i;
            if(!hm.containsKey(ch)){
                return false;
            }
        }
        return true;
    }
}
