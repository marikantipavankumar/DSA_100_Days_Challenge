package day62;

import java.util.HashSet;

public class Pangram_OP {
    static void main() {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        boolean ans = isPangram(sentence);

        System.out.println("IS Pangram:"+ans);
    }

    public static boolean isPangram(String sentence) {
        if(sentence.length()<26){
            return false;
        }

        HashSet<Character> hs = new HashSet<>();

        //   for(int i=0;i<sentence.length();i++){
        //     char ch = sentence.charAt(i);
        //     hs.add(ch);
        //   }

        for(char ch:sentence.toCharArray()){
            hs.add(ch);
        }
        return hs.size()==26;
    }
}
