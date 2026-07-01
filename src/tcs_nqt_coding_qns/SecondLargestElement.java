package tcs_nqt_coding_qns;
import java.util.*;
public class SecondLargestElement {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] parts = input.split(" ");
        int n = parts.length;
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        // findind second-largest element in an array

        int largest = Integer.MIN_VALUE;
        int sl = largest;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                sl = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sl) {
                sl = arr[i];
            }
        }
        if (sl == Integer.MIN_VALUE) {
            System.out.println("No Second Largest Found");
        } else {
            System.out.println(sl);
        }
    }

}
