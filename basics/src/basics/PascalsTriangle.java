package basics;

//package basics;
//public class PascalsTriangle {
//    static void main() {
//        int n = 6;
//        for(int i=0;i<n;i++){
//            // printing spaces
//            for(int j=0;j<n-i-1;j++){
//                System.out.print(" ");
//            }
//
//            int num = 1;
//            for(int j=0;j<=i;j++){
//                System.out.print(num+" ");
//
//                num = num*(i-j)/(j+1);
//            }
//            System.out.println();
//        }
//    }
//}
//
//

public class PascalsTriangle{
    public static void main(String[] args){
        int n = 6;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            int num =1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num = num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}



