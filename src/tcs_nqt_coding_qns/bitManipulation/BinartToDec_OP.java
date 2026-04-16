package tcs_nqt_coding_qns.bitManipulation;

import java.util.*;

public class BinartToDec_OP {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(convertBinToDec(s));
    }
    public static int convertBinToDec(String  s){
        return  Integer.parseInt(s,2);
    }
}
