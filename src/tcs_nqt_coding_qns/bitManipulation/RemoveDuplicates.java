package tcs_nqt_coding_qns.bitManipulation;
import java.util.*;
public class RemoveDuplicates {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int res = 0;

        for(String s:parts){
            int n = Integer.parseInt(s);
            res = res^n;
        }
        System.out.println(res);
    }
}
