package tcs_nqt_coding_qns.general.strings;

public class CountNoOfWordsInString {
    static void main() {
        String str = "Hello I am Pavan Marikanti hf ";
        String[] words = str.split(" ");
        System.out.println("No of Words in a given string is:"+words.length);
    }
}
