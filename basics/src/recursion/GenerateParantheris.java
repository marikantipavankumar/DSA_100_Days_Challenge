package recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheris {
    static void main() {
        int  n = 3;
        List<String> result = Solution3.generate(n);
        for(String s:result){
            System.out.print(s+" ");
        }
        System.out.println();
    }
}

class Solution3{
    public static List<String> generate(int n){
         List<String>result = new ArrayList<>();
         backtrack("",0,0,n,result);
         return result;
    }

    public static List<String> backtrack(String curr,int st,int end,int n,List<String> result){
        // base condition
        if(curr.length()==2*n){
            result.add(curr);
            return result;
        }
        if(st<n){
            backtrack(curr+"(",st+1,end,n,result);
        }
        if(end<st){
            backtrack(curr+")",st,end+1,n,result);
        }
        return result;
    }
}