package basics;

public class SecondLargestElement {
    static void main() {
        int[] arr = {94,34,65,90,6735,23,90};
        int largest = Integer.MIN_VALUE;
        int secLargest = largest;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            }

        }
        System.out.println(largest+" "+secLargest);
    }
}
