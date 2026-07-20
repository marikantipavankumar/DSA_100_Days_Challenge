package recursion;

public class PowerSet{
    public static void main(String[] args){
        String s = "abc";
        powerSet(s,0,"");
    }

    public  static void powerSet(String s,int index,String current){

        // Base Case
        if(index==s.length()){
            System.out.print("\""+current+"\" ");
            return;
        }

        // Include Present Characrter
        powerSet(s,index+1,current+s.charAt(index));

        // Exclude Present Character
        powerSet(s,index+1,current);
    }
}