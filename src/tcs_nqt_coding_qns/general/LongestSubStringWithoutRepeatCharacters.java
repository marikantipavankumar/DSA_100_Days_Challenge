package tcs_nqt_coding_qns.general;
import java.util.*;
public class LongestSubStringWithoutRepeatCharacters {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();
        int count=0;
        int l = 0;
        for(int r=0;r<input.length();r++){
            char ch = input.charAt(r);
            if(hs.contains(ch)){
                while(hs.contains(ch)){
                    hs.remove(input.charAt(l));
                    l++;
                }
            }
            hs.add(ch);
            count = Math.max(count,r-l+1);
        }
        System.out.println(count);
    }
}
