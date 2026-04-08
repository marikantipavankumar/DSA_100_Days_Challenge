package day57;

import java.util.HashMap;

public class MaxiumNmberOfBallons {
    static void main() {
        String text = "nlaebolko";
        int ans = maxNumberOfBallons(text);
        System.out.println("Max Number of Ballons is:"+ans);
    }
    public static int maxNumberOfBallons(String text) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<text.length();i++){
            char ch = text.charAt(i);
            if(ch=='b' || ch=='a' || ch=='l' || ch=='l' || ch=='o' || ch=='0' ||ch=='n'){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
        }

        String target = "balloon";
        int count = Integer.MAX_VALUE;
        int b = hm.getOrDefault('b',0);
        int a = hm.getOrDefault('a',0);
        int l = hm.getOrDefault('l',0)/2;
        int o = hm.getOrDefault('o',0)/2;
        int n = hm.getOrDefault('n',0);

        return Math.min(Math.min(a,b),Math.min(Math.min(l,o),n));
    }
}
