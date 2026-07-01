package day21;

public class ValidPalindrome_BF {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        if(isValidPalindrome(s)){
            System.out.println("The Given Phrase is a Valid Palindrome");
        }
        else{
            System.out.println("The Given Phrase is not a valid Palindrome");
        }
    }

    public static boolean isValidPalindrome(String s){

        String ans = "";

        // Remove non-alphanumeric characters
        for(int i = 0; i < s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                ans += Character.toLowerCase(s.charAt(i));
            }
        }

        // Reverse the cleaned string
        String reversed = "";
        for(int i = ans.length() - 1; i >= 0; i--){
            reversed += ans.charAt(i);
        }

        return ans.equals(reversed);
    }
}
