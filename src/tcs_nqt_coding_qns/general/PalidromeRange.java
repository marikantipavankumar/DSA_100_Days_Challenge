package tcs_nqt_coding_qns.general;

public class PalidromeRange {
    static void main() {
        int st = 234,ed=300;
        palindrome(st,ed);
    }

    public static  void  palindrome(int st,int ed){
        int i;
        for(i=st;i<=ed;i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }

    }

    public  static  boolean isPalindrome(int i){
        int num = i;
        int ans = 0;
        while(num!=0){
            int rem = num%10;
            ans=ans*10+rem;
            num=num/10;
        }

        return i==ans;
    }
}
