package infosys.arrays;

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int target = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i < n; i++) {

            int req = target - arr[i];

            if(hm.containsKey(req)) {
                System.out.println(hm.get(req) + " " + i);
                return;
            }

            hm.put(arr[i], i);
        }

        System.out.println("No Pair Found");
    }
}