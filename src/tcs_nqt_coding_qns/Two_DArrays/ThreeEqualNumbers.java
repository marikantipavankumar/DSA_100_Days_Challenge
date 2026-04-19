package tcs_nqt_coding_qns.Two_DArrays;

import java.util.*;
public class ThreeEqualNumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-->0){
            int p = sc.nextInt();
            int q = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(minStepsToEqual(p,q,r));
        }
        sc.close();
    }
    public static int minStepsToEqual(int p,int q,int r){
        int[] arr={p,q,r};
        if(arr[0]==arr[1] && arr[1]==arr[2]){
            return 0;
        }
        int steps=0;
        while(true){
            arr[0]+=1;
            arr[1]+=1;
            arr[2]-=1;
            steps++;
            Arrays.sort(arr);
            if(arr[0]==arr[1] && arr[1]==arr[2]){
                return steps;
            }

            if((arr[0]==arr[1] && arr[1]+1==arr[2]) ||
                    (arr[1]==arr[2] && arr[0]+1==arr[2]))
                    {
                return -1;
            }
        }
    }
}
