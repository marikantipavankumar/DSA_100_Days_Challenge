package basics_coding_for_Interviews;

import java.util.HashMap;

public class MaxCharacterInString {
    static void main() {
        String s = "Pavan Marikanti";
        HashMap<Character,Integer>hm = new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        int count = 0,max=0;
        char character=' ';
        for(char ch:s.toCharArray()){
            count = hm.get(ch);
            if(count>max){
                max=count;
                character=ch;
            }
        }

        System.out.print(character+"-");
        System.out.println(max);
    }
}
