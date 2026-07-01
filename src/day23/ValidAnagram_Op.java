package day23;

public class ValidAnagram_Op {
    static void main() {
        String s = "rat";
        String t = "car";
        boolean ans = isValidAnagram(s,t);
        System.out.println(ans);
    }

    public static boolean isValidAnagram(String s, String t) {

        // public boolean isAnagram(String s, String t) {

        int m = s.length();
        int n = t.length();

        if(m!=n){
            return false;
        }

        int[] ans = new int[26];
        for(int i=0;i<s.length();i++){
            int x=s.charAt(i)-'a';
            ans[x]=ans[x]+1;
        }

        for(int i=0;i<t.length();i++){
            int x=t.charAt(i)-'a';
            ans[x]=ans[x]-1;
        }


        for(int i=0;i<26;i++){
            if(ans[i]!=0){
                return false;
            }
        }

        return true;
    }

}
