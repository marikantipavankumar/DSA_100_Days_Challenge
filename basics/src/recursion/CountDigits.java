package recursion;

public class CountDigits {
    static void main() {
        int n = 12345;
        int count = 0;
        System.out.println("Number of digits are:"+countDig(n,count));
    }
    public static  int  countDig(int n ,int count){
        if(n==0){
            return count;
        }
        count++;
        return countDig(n/10,count);
    }
}
