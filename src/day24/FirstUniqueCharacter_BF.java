package day24;

import java.nio.charset.StandardCharsets;

public class FirstUniqueCharacter_BF {

    static void main() {
        String s = "loveleetcode";
        int n = findFirstUniqueCharacter(s);
        System.out.println(n);
    }
    public static int findFirstUniqueCharacter(String  s) {

        for(int i=0;i<s.length();i++){
            int j;
            boolean found =false;
            for(j=i;j<s.length();j++){
                if(i==j){
                    continue;
                }
              if(s.charAt(i)==s.charAt(j)){
                  found=true;
                  break;
              }
            }
           if(j==s.length()-1 && found==false){
               return i;

           }


        }
        return -1;
    }
    }
