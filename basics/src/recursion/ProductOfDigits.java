package recursion;

public class ProductOfDigits {
    static void main() {
        int n = 12345;
        System.out.println("Product Of Digits is:"+product(n));
    }

    public static int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10) *product(n/10);
    }
}
