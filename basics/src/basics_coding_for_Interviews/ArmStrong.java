package basics_coding_for_Interviews;

public class ArmStrong {
    static void main() {
        int n = 153;
        int temp = n;
        int len=0;
        while(temp>0){
            len++;
            temp=temp/10;
        }
        temp=n;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            sum += (int) (Math.pow(rem,len));
            temp/=10;
        }
        if(sum==n){
            System.out.println("ArmStrong Number");
        }
        else{
            System.out.println("The Given Number is not an ArmStrong Number");
        }

    }
}
