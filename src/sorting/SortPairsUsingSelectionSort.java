package sorting;
import  java.util.*;

public class SortPairsUsingSelectionSort {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }

        // selection sort
        for(int i=0;i<n;i++){
            int minIndex = i;
            for(int j =i+1;j<n;j++){
                if(arr[j][0]<arr[minIndex][0] || ((arr[j][0]==arr[minIndex][0]) && arr[j][1]<arr[minIndex][1])){
                        minIndex=j;
                }
            }

            int temp0 = arr[i][0];
            int temp1=arr[i][1];
            arr[i][0]=arr[minIndex][0];
            arr[i][1]=arr[minIndex][1];
            arr[minIndex][0]=temp0;
            arr[minIndex][1]=temp1;
        }

        // printing the elements
        for(int i=0;i<n;i++){
                System.out.println(arr[i][0]+" "+arr[i][1]);


        }
    }

}
