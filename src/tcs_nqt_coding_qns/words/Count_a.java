package tcs_nqt_coding_qns.words;

import java.util.ArrayList;

public class Count_a {
    static void main() {
        String s = "abbbaabbb";
        int ans = findCount(s);
        System.out.println("Number of a's is:"+ans);
    }

    public  static  int findCount(String s){
        ArrayList<String> list = new ArrayList<>();
        int i=0;
        while(i<s.length()){
            list.add(s.substring(i,i+3-1));
            i=i+3;
        }
        int max=0,count=0;
        for(int j=0;j<list.size();j++){
            for(int k=0;k<3;k++){
                if(s.charAt(k+j)=='a'){
                    count++;
                }
            }
            max= Math.max(max,count);
        }

        return max;
    }
}
