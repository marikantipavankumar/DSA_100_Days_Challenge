package day53;

import java.util.ArrayList;

public class GrayCode {
    static void main() {
        int n = 2;
        ArrayList<String> list = grayCode(n);
        System.out.println(list);
    }
    public static ArrayList<String> grayCode(int n){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < (1 << n); i++) {
            int gray = i ^ (i >> 1);
            String binary = Integer.toBinaryString(gray);

            // pad with leading zeros
            while (binary.length() < n) {
                binary = "0" + binary;
                // list.add(binary);
            }
            list.add(binary);

        }

        return list;
    }
}
