package basics_coding_for_Interviews;

public class GCD_OF_Two_Numbers {
    public static void main(String[] args){
       int a = 60,b=48;
       while(b!=0){
           int temp = b;
           b = a%b;
           a = temp;
       }
       System.out.println("Gcd of  60 and 46 is: "+a);
    }
}
