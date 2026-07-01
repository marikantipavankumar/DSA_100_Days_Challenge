package slidingwindow_practice;

public class Find_A_Occurances {
    static void main() {
        String s = "bbbaaababa";
        int k = 3;
        int ans = finda(s,k);
        System.out.println("Number of a occurances are :"+ans);

    }

    public  static  int finda(String s,int k){
        int max = 0,count = 0;
        int i =0;
        while(i<s.length()){
             count = findSubString(s,i,i+k-1);
            max = Math.max(max,count);
            i=i+k;
        }
        return  max;
    }

    public  static  int findSubString(String s,int i,int j){

        if(j>s.length()) {
            j--;
        }

        String k = s.substring(i,j);
        int count = 0;
        for(int h=0;h<k.length();h++){
            if(k.charAt(h)=='a'){
                count++;
            }
        }
        return  count;
    }
}
