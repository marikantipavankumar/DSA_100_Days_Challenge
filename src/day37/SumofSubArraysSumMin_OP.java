package day37;

public class SumofSubArraysSumMin_OP {
    static void main() {
        int [] arr = {3,1,2,4};
        int sum = subArraySum(arr);
        System.out.println(sum);
    }
    public static int subArraySum(int[] arr){
        int min = 0;
        int sum = 0;
        int r=0;
        for(int l=0;l<arr.length;l++){
            min = arr[l];
            r=l;

            while (r<arr.length){
                min = Math.min(min,arr[r]);
                sum = sum+min;
                r++;
            }
        }
        return  sum;
    }
}
