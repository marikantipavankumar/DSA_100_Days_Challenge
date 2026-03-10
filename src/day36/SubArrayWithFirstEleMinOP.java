package day36;

public class SubArrayWithFirstEleMinOP {
    static void main() {
        int[]arr={1,2,1};
        int ans = subArrayWithFirstEleMin(arr);
        System.out.println("Number of minimum  subArrays are:"+ans);
    }
    public static int subArrayWithFirstEleMin(int[] arr){
        int ans = 0;
        int r=0;
        for(int l=0;l<arr.length;l++){
            r=l;
            while (r<arr.length){
                if(arr[l]<=arr[r]){
                    ans++;
                }
                r++;
            }

        }
        return ans;
    }
}
