package day51_L_71;

import java.util.Stack;

public class SimplifyPath {
    static void main() {
        String path = "/home/user/Documents/../Pictures";

        String ans = simplifyPath(path);
        System.out.println("Simplified path is:" + ans);
    }

    public static String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String[] parts = path.split("/");
        StringBuilder sb = new StringBuilder();

        for (String part : parts) {
            if (part.equals(".") || part.isEmpty()) {
                continue;
            } else if (part.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            }
            else {
                s.push(part);
            }

        }
        for(String dir:s){
            sb.append("/").append(dir);
        }


        return sb.length()==0?"/":sb.toString();
    }
}
