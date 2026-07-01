package tcs_nqt_coding_qns.bitManipulation;
import java.util.*;
public class BinaryToDecimalConversion {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int result = 0;
        int base=1;
        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            if(ch=='1'){
                result = result+base;
            }
            base*=2;
        }
        System.out.println(result);
    }
}
