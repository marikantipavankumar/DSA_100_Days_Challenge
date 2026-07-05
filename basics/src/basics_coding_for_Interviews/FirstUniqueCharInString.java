package basics_coding_for_Interviews;

import java.util.HashMap;

public class FirstUniqueCharInString {
    static void main() {
        String s = "abbccd";
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }

        for(char c:s.toCharArray()){
            int n = hm.get(c);
            if(n==1){
                System.out.println("First Unique Character is:"+c);
                return;
            }
        }
        System.out.println("No Unique Character found");
    }
}
