package tcs_nqt_coding_qns.words;

public class CountPrice {
    static void main() {
        int n = 5244;
        int ans = findProduct(n);
        System.out.println("Product of diits shown ion the product is:"+
                ans);
    }

    public  static  int findProduct(int n){
            int ans = 1;
            while(n!=0){
                int rem = n%10;
                ans = ans*rem;
                n=n/10;
            }

            return  ans;
    }
}
