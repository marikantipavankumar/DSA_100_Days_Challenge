package tcs_nqt_coding_qns.general;
import java.util.*;

public class RemoveDuplicates {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashSet<Character> hs = new HashSet<>();


        StringBuilder sb  = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(!hs.contains(ch)){
                hs.add(ch);
                sb.append(ch);
            }
        }
        System.out.print(sb);
    }
}
