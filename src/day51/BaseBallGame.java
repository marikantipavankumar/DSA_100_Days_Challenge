package day51;
import java.util.Stack;


public class BaseBallGame {
    static void main() {
        String[] ops = {"5","2","C","D","+"};
        int ans = calPoints(ops);
        System.out.println("sum of all values is:"+ans);
    }
    public static int calPoints(String[] operations) {
      Stack<Integer> st = new Stack<>();

      for(String str:operations){
          if(str.equals("+")){
              int num = st.pop();
              int x = st.peek();
              st.push(num);
              st.push(num+x);
          }

         else if(str.equals("D")){
              st.push(st.peek()*2);
          }

         else if(str.equals("C")){
              st.pop();
          }
          else {
              int x = Integer.parseInt(str);
              st.push(x);
          }
      }

      int ans = 0;
      while (!st.isEmpty()){
          ans +=st.pop();
      }
      return ans;
    }

}