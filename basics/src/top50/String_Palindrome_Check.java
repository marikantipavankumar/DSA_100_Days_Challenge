package top50;

public class String_Palindrome_Check {
    static void main() {
        String s = "MadaM";
        boolean ans = isPalindrome(s);
        System.out.println("Given string is a Palindrome:"+ans);
    }

    static boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        String rev = sb.reverse().toString();

        if(s.equals(rev)){
            return true;
        }
        return false;
    }
}
