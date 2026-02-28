package day29;
import java.util.ArrayList;

public class PalindromicSubstrings {
    static void main() {
        String s = "aba";
        int ans = palindromicSubstrings(s);
        System.out.println("The number of palindromic Substrings in a given string are:"+ans);
    }
    public static  int palindromicSubstrings(String s){
            int count = 0;
            for(int i=0;i<s.length();i++){
                for(int j=i+1;j<=s.length();j++){
                    String sub =s.substring(i,j);
                    if(isPalindrome(sub)){
                    count++;
                    }
                }
            }

        return count;
    }

    public static boolean isPalindrome(String s){
        int len = s.length();
        int i=0;
        int j=len-1;
        while (i<j){
          if(s.charAt(i)!=s.charAt(j)){
               return false;
            }
            i++;
            j--;
        }
        return true;

    }
}