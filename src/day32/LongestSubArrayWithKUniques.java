package day32;

import com.sun.source.tree.BreakTree;

import java.util.HashMap;

public class LongestSubArrayWithKUniques {
    static void main() {
        String s="aabaaab";
        int k=2;
        int length=longestKSubstr(s,k);
        System.out.println("Longest Substring with K unique characters is:"+length);
    }
    public static int longestKSubstr(String s, int k) {
        // code here
        int l=0;
        int length=-1;

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int r=0;r<s.length();r++){
            hm.put(s.charAt(r),hm.getOrDefault(s.charAt(r),0)+1);

                while(hm.size()>k){
                    hm.put(s.charAt(l),hm.getOrDefault(s.charAt(l),0)-1);
                    if(hm.get(s.charAt(l))==0){
                        hm.remove(s.charAt(l));
                    }
                    l++;
                }
                if(hm.size()==k){
                    length=Math.max(length,r-l+1);
            }
        }

      return length;
    }
}
