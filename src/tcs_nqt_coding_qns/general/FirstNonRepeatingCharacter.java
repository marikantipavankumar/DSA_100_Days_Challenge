package tcs_nqt_coding_qns.general;
import java.util.*;

public class FirstNonRepeatingCharacter {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hm.get(ch)==1){
                System.out.println(ch);
                return;
            }
        }

        System.out.println("Not Found:");
    }
}
