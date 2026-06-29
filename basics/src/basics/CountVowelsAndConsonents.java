package basics;

import java.util.Scanner;

public class CountVowelsAndConsonents {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int vC=0,cC=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E'
            || ch=='I' || ch=='O' || ch=='U'){
                vC++;
            }
            else if(Character.isLetter(ch)){
                cC++;
            }
        }
        System.out.println("Count of Vowels is:"+vC+" Count of Consonents is:"+cC);
    }
}
