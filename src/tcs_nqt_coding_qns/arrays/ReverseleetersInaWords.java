package tcs_nqt_coding_qns.arrays;
import  java.util.*;
public class ReverseleetersInaWords {
    static void main() {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] words  = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            StringBuilder sb = new StringBuilder(words[i]);
            words[i]=sb.reverse().toString();

        }

        for(String word:words){
            System.out.print(word+" ");
        }
    }
}