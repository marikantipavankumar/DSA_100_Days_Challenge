package day24;

public class FirstUniqueCharacter_OP {
    static void main() {
        String s = "aabb";
        int n = findFirstUniqueCharacter(s);
        System.out.println(n);
    }

    public static int findFirstUniqueCharacter(String  s){
        int[] ans = new int[26];
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
            int x = ch-'a';
            ans[x]+=1;
        }

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int x = ch-'a';
            if(ans[x]==1){
                return i;
            }
        }
        return -1;
    }
}
