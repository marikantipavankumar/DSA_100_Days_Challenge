package recursion;

public class Sum_Of_Digits {
    static void main() {
        int n = 12345;
        int sum = 0;
        System.out.println("Sum of Digits in a Given Number is: "+digitSum(n,sum));
    }
    public static int digitSum(int n,int sum){
        if(n==0 ){
            return sum;
        }
        int rem = n%10;
        sum+=rem;
        return digitSum(n/10,sum);
    }
}
