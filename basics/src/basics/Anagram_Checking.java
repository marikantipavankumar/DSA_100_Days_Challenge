package basics;

public class Anagram_Checking {
    static void main() {
        String s1= "Pavan Marikanti";
        String s2="Marikanti Pavan";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        if(arr1.equals(arr2)){
            System.out.println("Yes,Both The Strings are Anagrams ");
        }
        else{
            System.out.println("Both are Not Anagrams");
        }
    }
}

