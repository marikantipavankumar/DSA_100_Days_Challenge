package day54;

import java.util.HashMap;
import java.util.HashSet;

public class MirrorFrequecyDistribution {
    public static void main(String[] args) {
        String s = "4m7n";
        int ans = mirrorFreq(s);
        System.out.println("Mirror Frequency of the given string is: " + ans);
    }

    public static int mirrorFreq(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();

        // Step 1: Count frequency
        for (char ch : s.toCharArray()) {
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }
        int sum = 0;
        HashSet<Character> visited = new HashSet<>();

        for(char ch:hm.keySet()){
            if(visited.contains(ch)){
                continue;
            }
            char mirror;

            if(Character.isDigit(ch)){
                mirror=(char)('9'-ch+'0');
            }else{
                mirror = (char)('z'-ch+'a');
            }
            int freqC=hm.getOrDefault(ch,0);
            int freqM=hm.getOrDefault(mirror,0);

            sum+=Math.abs(freqC-freqM);
            visited.add(ch);
            visited.add(mirror);

        }
        return sum;
    }
}