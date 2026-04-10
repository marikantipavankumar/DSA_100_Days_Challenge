package day59;

public class JewelsAndStones {
    static void main() {
       String  jewels = "aA", stones = "aAAbbbb";
       int ans = numJewelsInStones(jewels,stones);
       System.out.println("Answer is:"+ans);
    }

    public static int numJewelsInStones(String jewels, String stones) {
       int count = 0;
       char[] arr = stones.toCharArray();
        for(int i=0;i<jewels.length();i++){
           char ch = jewels.charAt(i);
            for(int j=0;j<arr.length;j++){
                if(arr[j]==1){
                    continue;
                }
                else if(ch==arr[j]){
                    count++;
                    arr[j]='1';
                }
            }
       }
        return count;
    }
}
