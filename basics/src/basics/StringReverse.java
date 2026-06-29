package basics;

public class StringReverse {
    static void main(String[] args) {
        String s = "Pavan Marikanti";
        int i= s.length()-1;
        StringBuilder sb = new StringBuilder();
        while(i>=0){
            sb.append(s.charAt(i));
            i--;
        }
        String rev = sb.toString();
        System.out.println("Reversed String is:"+rev);
    }
}
