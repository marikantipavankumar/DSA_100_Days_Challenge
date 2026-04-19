package inputTaking;
import java.util.*;
public class InputWithoutSqBrackets {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().split(" ");
        int[] arr = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i]);

        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
