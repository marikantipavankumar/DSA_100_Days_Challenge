package tcs_nqt_coding_qns.arrays;

public class fineCollection {
    static void main() {
        int[] arr = {2,5,1,6,8};
        int n = 5;
        int date  = 3;
        int fine = 300;

        int amountCollected = calculateFine(arr,n,date,fine);
        System.out.println("Total amount of Fine collected is: "+amountCollected);
    }

    public static int calculateFine(int[] arr,int n,int date,int fine){
        boolean isEven =false;
        int amount = 0;
        if(date%2==0){
            isEven=true;
        }
        if(isEven){
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2!=0){
                    amount=amount+fine;
                }
            }
        }
        else{
            for(int i=0;i<arr.length;i++){
                if(arr[i]%2==0){
                    amount=amount+fine;
                }
            }
        }

        return amount;
    }
}
