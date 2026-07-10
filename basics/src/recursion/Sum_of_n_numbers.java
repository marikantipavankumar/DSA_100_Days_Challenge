package recursion;

public class Sum_of_n_numbers {
    static void main() {
        int x = 1;
        int n = 10;
        sumN(x,n,0);
    }

    public static void sumN(int x,int n,int sum){

        if(x>n){
            System.out.println(sum);
            return;
        }
        sum=sum+x;
        sumN(x+1,n,sum);
    }
}
