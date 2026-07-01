package slidingwindow_practice;
import java.util.*;
public class FindAOccurances {
    static void main() {
        String s="aabbaacaaaaaa";
        int k=5;
        System.out.println(findKOccurances(s,k));

    }
    public static int findKOccurances(String s,int k){

        int n = s.length();
        if(k>n){
            return -1;
        }
        int count = 0,max=0;
        int l=0;
        for(int i=0;i<k;i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }

        max = Math.max(count,max);

        for(int i=k;i<n;i++){
            if(s.charAt(i)=='a'){
                count++;
            }
            if(s.charAt(l)=='a'){
                count--;
            }

            l++;
            max = Math.max(count,max);
        }
        return max;
    }
}
