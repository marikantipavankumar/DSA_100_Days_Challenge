package inputTaking;
import java.util.*;
public class StringsWithCommasAndSqBrackets {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().trim();
        input = input.replace("[","").replace("]","");
        String[] parts = input.split(",");
        int[] arr = new int[parts.length];

        for(int i=0;i<parts.length;i++){
            arr[i]=Integer.parseInt(parts[i].trim());
        }

        for(int val:arr){
            System.out.print(val+" ");
        }
    }

}
