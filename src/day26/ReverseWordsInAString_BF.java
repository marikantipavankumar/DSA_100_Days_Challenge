package day26;

public class ReverseWordsInAString_BF {
    public static void main(String[] args){
        String s = "The Sky is Blue";
        String reversed = reverseWords(s);
        System.out.println("reversed String is:"+reversed);
    }
    public static String reverseWords(String s){
        // step 1: remove all the starting ,ending,extra spaces in the given string
        String st = s.trim().replaceAll("\\s+"," ");

        // step 2: Split the words and place in a String array
        String[] words = st.split(" ");

        // step 3: create a string builder to add the words in the reverse order
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return  sb.toString();
    }
}
