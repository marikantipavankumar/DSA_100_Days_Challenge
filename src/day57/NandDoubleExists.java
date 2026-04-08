package day57;

public class NandDoubleExists {
    static void main() {
        int[] arr = {10,2,5,3};
        boolean ans = findNandDoubleExists(arr);
        System.out.println("Answer is:"+ans);
    }

    public static  boolean findNandDoubleExists(int[] arr){

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                if(i==j){
                    continue;
                }
                else if(arr[i]==2*arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
