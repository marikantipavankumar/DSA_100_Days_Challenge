package recursion;

public class print_1_to_n{
    public static void main(String[] args){
        int n =5;
        int x=1;
        printNum(x,n);
    }
    public  static void printNum(int x,int n){
        if(n<x){
            return;
        }
        System.out.println(n+" ");
        printNum(x,n-1);
    }
}