package tcs_nqt_coding_qns;
import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int[] arr = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            arr[i] =Integer.parseInt(parts[i]);
        }

        int j = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j]=arr[i];
                j++;
            }
        }
        while (j<arr.length){
            arr[j]=0;
            j++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
