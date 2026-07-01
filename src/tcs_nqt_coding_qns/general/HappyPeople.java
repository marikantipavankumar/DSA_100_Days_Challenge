package tcs_nqt_coding_qns.general;
import java.util.*;

public class HappyPeople {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int it = sc.nextInt();
        double happy=n;
        double sad = 0;

        for(int i=0;i<it;i++){
            double n_h= 0.3 * happy + 0.5 * sad;
            double n_s = 0.7 * happy+ 0.5  * sad;
            happy=n_h;
            sad = n_s;
        }
        System.out.println((int)happy+" "+(int)sad);
    }
}