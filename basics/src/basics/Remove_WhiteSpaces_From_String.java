package basics;

public class Remove_WhiteSpaces_From_String {
    static void main() {
        String s = "Au tom ati on";
        String res = s.replaceAll("\\s+","");
        System.out.println(res);

    }
}
