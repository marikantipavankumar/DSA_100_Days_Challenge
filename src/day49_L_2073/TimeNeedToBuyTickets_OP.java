package day49_L_2073;

public class TimeNeedToBuyTickets_OP {
    static void main() {
        int[] tickets = {84,49,5,24,70,77,87,8};
        int k = 3;
        int ans = timeRequiredToBuy(tickets,k);
        System.out.println("Time Required to buy Tickets is:"+ans);
    }

    public  static int timeRequiredToBuy(int[] tickets, int k) {
        int val = tickets[k];
        int ans = 0;
        for(int i = 0;i<tickets.length;i++){
            if(i<=k){
                ans += Math.min(val,tickets[i]);
            }
            else{
                ans +=Math.min(val-1,tickets[i]);
            }
        }
        return ans;
    }

}

