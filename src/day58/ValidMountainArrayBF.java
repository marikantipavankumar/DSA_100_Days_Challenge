package day58;

public class ValidMountainArrayBF {
    static void main() {
        int[] arr = {2,0,2};
        boolean ans = isValidMountain(arr);
        System.out.println("The Given array is a Valid Mountain Array:"+ans);
    }


    public static boolean isValidMountain(int[] arr){
        int i;
        // arrayLength should be greater than or equal to 3
        if(arr.length<3){
            return false;
        }
        if(arr[0]>arr[1] || arr[arr.length-1]>arr[arr.length-2]){
            return false;
        }
        for( i=1;i<arr.length;i++){


            // No two adjacent elements should be equal
            if(arr[i]==arr[i-1]){
                return false;
            }

            else if(arr[i]>arr[i-1]){
                continue;
            }

            // else peak is found so break from this loop start another loop
            else{
                break;
            }

        }

        int j;

        for(j=i;j<arr.length;j++){

            if(arr[j]==arr[j-1]){
                return false;
            }

            else if(arr[j]<arr[j-1]){
                continue;
            }
        }

        if(j==arr.length){
            return true;
        }
        else{
            return false;
        }

    }
}
