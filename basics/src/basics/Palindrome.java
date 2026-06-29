package basics;

public class Palindrome {
    static void main() {
        String s = "Pavan Marikanti";
        StringBuilder sb = new StringBuilder();
        int i=s.length()-1;
        while(i>=0){
            sb.append(s.charAt(i));
            i--;
        }
        String rev = sb.toString();
        if(s.equals(rev)){
            System.out.println("Both Strings are Palindromes:");
        }
        else{
            System.out.println("Both Strings are Not Palindromes:");
        }
    }
}
