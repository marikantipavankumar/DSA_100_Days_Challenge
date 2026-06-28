class Solution {
    public boolean isPalindrome(String s) {
        String text = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(text.charAt(i))){
                sb.append(text.charAt(i));
            }
        }
        String result = sb.toString();
        String rev = new StringBuilder(sb).reverse().toString();
       
        if(result.equals(rev)){
            return true;
        }
        return false;
    }
}