package basics;

import java.util.Scanner;

public class CheckStringEmptyOrNot {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); // .next() reads only one word ,.nextLine() reads entire line
        if(str.isEmpty()){
            System.out.println("Given String is Empty");
        }
        else {
            System.out.println("Given String is Not Empty");
        }
    }
}
