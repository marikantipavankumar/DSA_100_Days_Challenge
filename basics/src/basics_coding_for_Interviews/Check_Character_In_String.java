package basics_coding_for_Interviews;

import java.util.Scanner;

public class Check_Character_In_String {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character :");
        char ch = sc.next().charAt(0); // there is no inbuilt .nextchar() method ,so take input as string and
        // take the first character in it;
//        String t = sc.nextLine();


        System.out.println("Enter the String:");
        String s = sc.next();
        for(char c:s.toCharArray()){
            if(c==ch){
                System.out.println("Character Found in String");
                return;
            }
        }
        System.out.println("Character Not Found In String");
    }
}
