package tcs_nqt_coding_qns.Two_DArrays;

public class Example1 {
    public static  void  main(String[] args){
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,22,22}
        };

//        for(int i=0;i< arr.length;i++){
//            for(int j=0;j<arr.length;j++){
//                System.out.print(arr[i][j] +" ");
//            }
//            System.out.println(" ");
//        }

//        int sum = calculateSum(arr);
//        System.out.println("Sum is:"+sum);
//
   //      rowSum(arr);
        colSum(arr);
//
    }

    public static int  calculateSum(int[][] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                sum = sum+arr[i][j];
            }
        }
       return sum;

   }

   public static void rowSum(int[][] arr){
         for(int i=0;i<arr.length;i++){
             int rS = 0;
             for(int j=0;j<arr.length;j++){
                 rS=rS+arr[i][j];
             }
             System.out.print(i+1+" row  sum is: ");
             System.out.println(rS);
         }
   }

   public static  void  colSum(int[][] arr){
         for(int i=0;i<arr[0].length;i++){
                int colSUm = 0;
                for(int j=0;j<arr.length;j++){
                    colSUm+=arr[j][i];
                }
                System.out.println(i+" Col Sum is: "+colSUm);
         }
   }

}
