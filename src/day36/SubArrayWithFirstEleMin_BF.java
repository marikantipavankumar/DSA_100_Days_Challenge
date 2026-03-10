package day36;

public class SubArrayWithFirstEleMin_BF {
    static void main() {
        int[] arr = {1,2,1};
        int count = subArrayMinEle(arr);
        System.out.println("Count of all the valid sub Arrays with min 1st element is:"+count);
    }

    public static int subArrayMinEle(int[] arr){
        int ans = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    ans++;
                }
            }
        }
        return ans;
    }
}
