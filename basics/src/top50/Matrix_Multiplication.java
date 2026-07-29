package top50;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Multiplication {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first matrix number of rows and cols");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();

        System.out.println("Enter the Second matrix number of rows and cols");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        if(c1==r2){
            int[][] result = new int[r1][c1];
        }
        else {
            System.out.println("Matrix Multiplication can't possible with this dimensions");
            return;
        }

        int[][] m1 = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                m1[i][j]=sc.nextInt();
            }
        }

        int[][] m2 = new int[r2][c2];
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                m2[i][j]=sc.nextInt();
            }
        }

        int[][] res = matrixMultiplication(m1,m2,r1,c1,r2,c2);
        System.out.println("Resultant Matrix:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] matrixMultiplication(int[][] m1,int[][] m2,int r1,int c1,int r2,int c2){
       int[][] res = new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j =0;j<c2;j++){
                for(int k = 0;k<c1;k++){
                    res[i][j]+=m1[i][k]*m2[k][j];
                }
            }
        }
        return res;
    }
}
