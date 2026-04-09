package day58;

public class ValidMountain_OP {
    static void main() {
        int[] arr = {2,0,2};
        boolean ans = isValidMountain(arr);
        System.out.println("The Given array is a Valid Mountain Array:"+ans);
    }

    public  static  boolean isValidMountain(int[]arr){
                 if (arr.length < 3) return false;

                int i = 0;

                // climb up
                while (i + 1 < arr.length && arr[i] < arr[i + 1]) {
                    i++;
                }

                // peak must not be first or last
                if (i == 0 || i == arr.length - 1) {
                    return false;
                }

                // climb down
                while (i + 1 < arr.length && arr[i] > arr[i + 1]) {
                    i++;
                }

                return i == arr.length - 1;
    }

}
