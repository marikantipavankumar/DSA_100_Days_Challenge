package basics;
import java.util.Arrays;
public class RemoveDuplicates {
    static void main() {
        int[] arr = {23,13,54,65,45,34,54,23,45};
        Arrays.sort(arr);
        int[] res=new int[arr.length];
        int j=0;
        res[j]=arr[j];
        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                j++;
                res[j]=arr[i];
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
