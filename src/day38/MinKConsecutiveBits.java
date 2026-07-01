package day38;

public class MinKConsecutiveBits {
    static void main() {
        int[] arr = {0, 0, 1, 1, 1, 0, 0};
        int k = 3;
        int ans = findMinConBits(arr,k);
        System.out.println("Min Number of K Consecutive Bits are:"+ans);
    }
    public static int findMinConBits(int[] arr,int k){
        int n = arr.length;
        int flips = 0;

        for(int i=0;i<=n-k;i++){

            if(arr[i] == 0){

                for(int j=i;j<i+k;j++){
                    arr[j] = arr[j] ^ 1;
                }

                flips++;
            }
        }

        for(int i=n-k+1;i<n;i++){
            if(arr[i]==0){
                return -1;
            }
        }

        return flips;
    }
}
