package recursion;

public class FibonacciSeries {
    static void main() {
        int n = 5;
        if(n<0){
            return;
        }
        if(n==0){
            System.out.print("0");
            return;
        }
        int count = 2;
        int second = 0;
        int first = 1;
        System.out.print(second+" "+first+" ");
       fib(second,first,n,count);
    }
    static  void fib(int second,int first,int n ,int count){
        if(count>n){
            return;
        }
        int sum = first+second;
        System.out.print(sum+" ");
        second=first;
        first=sum;
        count++;
        fib(second,first,n,count);
    }
}
