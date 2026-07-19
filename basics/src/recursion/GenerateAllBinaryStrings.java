package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateAllBinaryStrings {
    public static void main(String[] args){
        List<String> result = new ArrayList<>();
        int n = 3;
        Solution2.generate(n,"",result);

        for(String s:result){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}

class Solution2{

    public static void generate(int n, String s, List<String> result) {
        if(s.length()==3){
            result.add(s);
            return;
        }

        generate(n,s+"0",result);
        if(s.isEmpty() || s.charAt(s.length()-1)!='1'){
            generate(n,s+"1",result);
        }
    }
}
