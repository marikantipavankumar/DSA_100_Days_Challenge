package tcs_nqt_coding_qns.arrays;
import  java.util.*;
public class MaxSUmSUbArrayOfK {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();

        String[] parts=sc.nextLine().split(" ");
        int[] arr = new int[parts.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(parts[i]);
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum = 0,count = 0;
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
            if(hm.containsKey(sum-k)){
                count+=hm.get(sum-k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        System.out.println(count);
    }
}
