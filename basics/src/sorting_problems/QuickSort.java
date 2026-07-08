package sorting_problems;

public class QuickSort {
    static void main() {
        int[]arr = {10,80,30,90,40};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }

    public static void quickSort(int[] arr,int si,int ei){
        if(si<ei){
            int pi = partition(arr,si,ei);

            quickSort(arr,si,pi-1);
            quickSort(arr,pi+1,ei);
        }

    }

    public static int partition(int[]arr,int si,int ei){
        int pivot = arr[ei];
        int i=si-1;

        for(int j=si;j<=ei;j++){
            if(arr[j]<pivot){
              i++;
              swap(arr,i,j);
            }
        }

        swap(arr,i+1,ei);
        return i+1;
    }

    public static void swap(int[]arr,int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
