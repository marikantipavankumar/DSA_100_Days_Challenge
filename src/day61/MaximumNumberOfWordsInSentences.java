package day61;

public class MaximumNumberOfWordsInSentences {
    static void main() {


        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int ans = mostWordsFound(sentences);
        System.out.println("Maximum Number Of words in a sentence is:"+ans);
    }
    public  static int mostWordsFound(String[] sentences) {
        int count =0;
        for(int i=0;i<sentences.length;i++){
            String[] temp = sentences[i].split(" ");
            int j=0;
            int ans = 0;
            while(j<temp.length){
                ans++;
                j++;
            }
            count = Math.max(ans,count);
        }
        return count;
    }
}
