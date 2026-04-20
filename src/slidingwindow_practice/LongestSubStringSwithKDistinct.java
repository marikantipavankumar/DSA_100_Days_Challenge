package slidingwindow_practice;
import java.util.*;
public class LongestSubStringSwithKDistinct {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();

        HashSet<Character> hs = new HashSet<>();
        int max = 0;
        int count = 0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!hs.contains(ch) && count<k){
                hs.add(ch);
                count++;
            }
            
        }
    }
}
