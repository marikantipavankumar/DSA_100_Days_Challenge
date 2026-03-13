package slidingwindow_practice;

public class SumGreaterThanThreshold {
    static void main() {
        int[] arr = {2,1,5,4,8,6};
        int threshold=3;
        int k=3;
        int ans=sumGreaterThanThreshold(threshold,arr,k);
        System.out.println("Number of Subarrays whose avg greater that threshold is:"+ans);
    }

    public static int sumGreaterThanThreshold(int th,int[] arr,int k){
        int avg=0,l=0,r;
        int sum=0,count=0;
        // setting the first window
        for(r=0;r<k;r++){
            sum = sum+arr[r];
        }
        avg = sum/k;
        if(avg>=th){
            count++;
        }

        // now sliding the window over the given array

        for(r=k;r<arr.length;r++){
            int j=l+1;
            sum=0;
            while (j<=r){
                sum=sum+arr[j];
                j++;
            }
            avg=sum/k;
            if(avg>=th){
                count++;
            }
        }
        return count;
    }
}
