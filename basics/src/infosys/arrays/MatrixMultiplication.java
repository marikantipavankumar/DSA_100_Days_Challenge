package infosys.arrays;

import java.util.Scanner;

public class MatrixMultiplication {
    static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of first matix:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] a = new int[m][n];

        System.out.println("Enter the dimensions of second matrix:");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int[][] b = new int[p][q];

        if(n!=p){
            System.out.println("Matrix Multiplication not possible for the given dimensions");
            return;
        }

        System.out.println("Enter the elements of the First matix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the Elements of the second Matrix:");
        for(int i=0;i<p;i++){
            for(int j=0;j<q;j++){
                b[i][j]=sc.nextInt();
            }
        }

        int[][] result = new int[n][q];
         for(int i=0;i<m;i++){
             for(int j=0;j<q;j++){
                 int sum = 0;
                 for(int k=0;k<n;k++){
                     sum +=a[i][k]*b[k][j];
                 }
                 result[i][j]=sum;
             }
         }

         // print result
        System.out.println("Result :");
         for(int i=0;i<m;i++){
             for(int j=0;j<q;j++){
                 System.out.print(result[i][j]+" ");
             }
             System.out.println();
         }

         sc.close();
    }
}
