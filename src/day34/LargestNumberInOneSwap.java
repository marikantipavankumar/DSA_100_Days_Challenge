package day34;

public class LargestNumberInOneSwap {
    static void main() {
        String s = "768";
        String x=s;
        String max=x;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)>s.charAt(j)){
                    char temp=s.charAt(i);
                    j=s.charAt(i);
                    i=temp;
                }
            }
        }
    }
}
