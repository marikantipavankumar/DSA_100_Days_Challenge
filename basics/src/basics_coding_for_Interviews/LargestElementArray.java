package basics_coding_for_Interviews;

public class LargestElementArray {
    static void main() {
        int[] arr = {94,34,65,90,6735,23,90};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Max Element in the given Array is:"+max);
    }

}
