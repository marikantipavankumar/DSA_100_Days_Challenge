package top50;

import java.util.Scanner;

public class Pattern_Printing {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        int row = sc.nextInt();
        System.out.println("Enter the number of cols");
        int col = sc.nextInt();

        squarePattern(row,col);

        rightTriangle(row);

    }

    static  void squarePattern(int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static  void rightTriangle(int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
