package top50;

import java.util.Scanner;

public class SpiralMatrix {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}
                      };

        int rows = arr.length;
        int cols = arr[0].length;
        spiralMatrix(arr,rows,cols);
    }

    static void  spiralMatrix(int[][]arr,int rows,int cols){

        int top = 0;
        int left = 0;
        int right = cols-1;
        int bottom = rows-1;

        while(top<=bottom && left<=right){
            // traverse from left to right
            for(int i = left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;

            // traverse Top to bottom
            for(int i=top;i<=bottom;i++){
                System.out.print((arr[i][right])+" ");
            }
            right--;

            // traverse right to left
            for(int i =right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;

            // traverse bottom to top
            for(int i=bottom;i>=top;i--){
                System.out.print(arr[left][i]+" ");
            }

            left++;
        }
    }
}
