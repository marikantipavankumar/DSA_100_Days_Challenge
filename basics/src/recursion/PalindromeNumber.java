package recursion;

public class PalindromeNumber {
    static void main() {
        int n = 121;
        int x=n;
        System.out.println("Given Digit is a Palindrome:"+isPalindrome(n,x,0));
    }

    public static boolean isPalindrome(int n,int x,int num){
        if(n==0){
            if(x==num){
                return true;
            }
            return false;
        }
        int rem   = n%10;
        num = (num*10)+rem;
        return isPalindrome(n/10,x,num);
    }
}
