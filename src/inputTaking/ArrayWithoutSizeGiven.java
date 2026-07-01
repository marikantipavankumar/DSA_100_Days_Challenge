package inputTaking;
import java.util.*;

public class ArrayWithoutSizeGiven {
    public static void  main(String[] args){

        Scanner sc  =new Scanner(System.in);

        /* i........     array with spacesand no size given
        String[] s = sc.nextLine().split(" ");

        int max = Integer.MIN_VALUE;
        for(String val:s){
           int num = Integer.parseInt(val);
           if(num>max){
               max = num;
           }
        }
        System.out.println(max);
      */

        /* ii......   Single line int input
        int n = sc.nextInt();
        System.out.println(n);

         */

        /* reading strings--two types .next()--reads only one word stops if tab or spaces came,.nextLine() -- reads the whole line including spaces and tabspaces and new line
        String s = sc.next();
        String st = sc.nextLine();
         */

        /* iii.....       array with size and elements given sepatately
         size:5
         elements: 10 30 593 84 85
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        for(int num:arr){
            System.out.print(num +" ");
        }

         */


        // Taking 1st array number as the input size        ex: 5,3,4,6,7   where 5 is the array size

        /* int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
           arr[i]= sc.nextInt();
        }
        for (int val:arr){
            System.out.print(val+" ");
        }
         */

        // Mixed Input as int and strings
//        int  n = sc.nextInt();
//        String a = sc.next();




    }
}
