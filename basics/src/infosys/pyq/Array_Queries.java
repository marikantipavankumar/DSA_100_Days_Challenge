package infosys.pyq;

import java.util.Scanner;

public class Array_Queries {
    static final int MOD = 1000000007;

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter The number of Queries");
        int q = sc.nextInt();
        int[][] queries= new int[3][q];
        for(int i=0;i<q;i++){
            for(int j=0;j<3;j++){
                queries[i][j]=sc.nextInt();
            }
        }
        System.out.println("Sum is:"+solveQueries(arr,queries));
    }

    public  static  int solveQueries(int[] arr,int[][] queries){

        long totalAnswer = 0;
        for(int[] query:queries){
            int type = query[0];
            int l = query[1];
            int r =  query[2];

            l--;
            r--;

            if(type==1){
                int base = arr[l];

                for(int i=l;i<=r;i++){
                    arr[i]=(i-l+1)*base;
                }
            }
            else{
                long sum = 0;
                for(int i=l;i<=r;i++){
                    sum=(sum+arr[i])%MOD;
                }
                totalAnswer = (totalAnswer + sum) % MOD;

            }

        }
        return (int)totalAnswer;
    }
}
