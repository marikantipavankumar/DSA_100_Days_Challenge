package slidingwindow_practice;
import  java.util.*;

public class LongestSubstringWithoutRepeatingChar {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> hs = new HashSet<>();
        int l=0,max= 0;
        for(int r=0;r<s.length();r++){

            char ch = s.charAt(r);
            while(hs.contains(ch)){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(ch);
            max = Math.max(max,r-l+1);
        }

        System.out.println(max);
    }
}
