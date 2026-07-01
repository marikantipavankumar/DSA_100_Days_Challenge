package tcs_nqt_coding_qns.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    static void main() {
        int m = 3, n = 3;
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        List<Integer> list = spiralOrder(arr, m, n);
        System.out.println(list);
    }

    public static List<Integer> spiralOrder(int[][] arr, int m, int n){
        int top = 0, bottom = m - 1, left = 0, right = n - 1;
        List<Integer> list = new ArrayList<>();

        while(top <= bottom && left <= right){

            // left → right
            for(int i = left; i <= right; i++){
                list.add(arr[top][i]);
            }
            top++;

            // top → bottom
            for(int i = top; i <= bottom; i++){
                list.add(arr[i][right]);
            }
            right--;

            // right → left
            if(top <= bottom){
                for(int i = right; i >= left; i--){
                    list.add(arr[bottom][i]);
                }
                bottom--;
            }

            // bottom → top
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    list.add(arr[i][left]);
                }
                left++;
            }
        }

        return list;
    }
}