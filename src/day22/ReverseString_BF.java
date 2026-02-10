package day22;

public class ReverseString_BF {
    static void main() {
        char[] str ={'H','E','E','L','O'};
        reverseString(str);
    }

    public static void reverseString(char[] str){
        int n = str.length;
        char[] arr=new char[n];

        int j=0;
        for(int i=n-1;i>=0;i--){
            arr[j]=str[i];
            j++;
        }

        // modify the original array with the new array

        for(int i=0;i<str.length;i++){
            str[i]=arr[i];
        }
        System.out.println(str);
    }
}
