package slidingwindow_practice;
import java.util.*;
public class SUbArraySumEqualsK {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int k  = sc.nextInt();
        int[] arr = {1,2,3,2,5,7};

        int count = 0;
        int sum = 0;
        int l=0;
        for(int r=0;r<arr.length;r++){
            sum = sum+arr[r];
            if(sum>k){
                while(l<r && sum>k) {
                    sum -= arr[l];
                    l++;
                }
            }
            if(sum==k){
                count++;
            }

        }
        System.out.println(count);
    }
}
