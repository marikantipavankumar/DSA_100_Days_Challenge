package recursion;

public class BinarySearch {
    static void main() {
        int[]arr = {2,5,8,9,12,15};
        int index = binarySearch(arr,10,0,arr.length-1);
        System.out.println("Target Element is found at index:" +index);
    }
    public static int binarySearch(int[]arr,int target,int si,int ei){

        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }

        else if(arr[mid]>target){
            return binarySearch(arr,target,si,mid-1);
        }

        else {
            return  binarySearch(arr,target,mid+1,ei);
        }
    }
}

