package tcs_nqt_coding_qns.arrays;
import java.util.*;

public class SortingTransactions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("ERROR: Invalid Transaction");
            return;
        }

        TreeSet<Integer> ts = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            String temp = sc.next();

            if (!isValidNum(temp)) {
                System.out.println("ERROR: Invalid Transaction");
                return; // STOP execution
            }

            ts.add(Integer.parseInt(temp));
        }

        int count = 0;
        int size = ts.size();

        for (int val : ts) {
            System.out.print(val);
            if (count != size - 1) {
                System.out.print(" ");
            }
            count++;
        }
    }

    public static boolean isValidNum(String temp) {
        if (temp.isEmpty()) return false;

        for (int i = 0; i < temp.length(); i++) {
            if (!Character.isDigit(temp.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}