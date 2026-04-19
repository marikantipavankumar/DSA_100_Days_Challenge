package tcs_nqt_coding_qns.general;
import java.util.*;
public class CheckAnagram {
    static void main() {
        Scanner sc  = new Scanner(System.in);
        String s1 = sc.nextLine().toLowerCase();
        String s2 = sc.nextLine().toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.println("False");
            return;
        }

        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        for(int i=0;i<s2.length();i++){
            char ch  = s2.charAt(i);
            if(hm.containsKey(ch)){
                int val = hm.get(ch);
                hm.put(ch,val-1);

                if(hm.get(ch)==0){
                    hm.remove(ch);
                }
            }
            else {
                System.out.println("false");
                return;
            }
        }
        System.out.println("True");

    }
}
