package day26;

public class ReverseWordsInAString_OP {
    public static void main(String[] args){
        String s = "Sky is Blue";
        String reversed = reverseWords(s);
        System.out.println(reversed);
    }

    public static String  reverseWords(String s){
        int i = s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){

            // step 1: skipping the spaces
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            int j=i;
            // step 2: finding the word in between two spaces
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }

            // step 3: add the word  to the String builder  y usin the substring in between the i and j

            sb.append(s.substring(i+1,j+1));
            sb.append(" ");

        }
        return sb.toString().trim();
    }
}
