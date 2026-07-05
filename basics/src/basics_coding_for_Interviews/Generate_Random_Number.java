package basics_coding_for_Interviews;

import java.util.Random;

public class Generate_Random_Number {
    static void main() {
        Random random = new Random();
        System.out.println(random.nextInt(100));
    }
}
