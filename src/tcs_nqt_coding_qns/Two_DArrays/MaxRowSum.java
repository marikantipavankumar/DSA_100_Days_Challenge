package tcs_nqt_coding_qns.Two_DArrays;
import java.util.*;
public class MaxRowSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }

        int[][] matrix = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    matrix[i][j]=0;
                }
                else{
                    matrix[i][j]=sc.nextInt();
                }
            }
        }


        // calculating Sum
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<n;j++){
                if(i==j){
                    matrix[i][j]=cost[i];
                }
                count = count+matrix[i][j];
            }
            if(count<ans){
                ans = count;
            }
        }

        System.out.print(ans);

    }
}