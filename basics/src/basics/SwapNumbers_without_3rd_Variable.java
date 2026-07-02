package basics;

public class SwapNumbers_without_3rd_Variable {
    static void main() {
        int a = 10,b=5;
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("a :"+a+" b is:"+b);
    }
}
