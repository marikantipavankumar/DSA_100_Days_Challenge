package tcs_nqt_coding_qns.Two_DArrays;
import java.lang.classfile.attribute.SyntheticAttribute;

import  java.util.*;
public class FindTotalMarks {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int r =sc.nextInt();
        if(r<=0){
            System.out.println("Error:Invalid Input");
            return;
        }

        double[][] arr = new double[r][2];
        for(int i=0;i<r;i++){
            for(int j=0;j<2;j++){
                arr[i][j] = sc.nextDouble(); // Internal Marks
            }
        }

        int v = sc.nextInt();
        if(v<0 || v>=r){
            System.out.println("Error:Invalid Input");
            return;
        }


        double marks=0;
        marks = arr[v][0] + arr[v][1];


        System.out.println("Total Marks are:"+marks);
    }
}
