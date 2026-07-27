package backtracking;

import java.util.ArrayList;

public class Maze {
    static void main() {
//        System.out.println(count(3,3));
//        System.out.println(pathRet("",3,3));

        boolean[][] board = {
                { true,true,true},
                {true,false,true},
                {true,true,true}
            };

        pathRestrictions(board,"",0,0);

        }
    static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int right = count(r-1,c);
        int left = count(r,c-1);

        return right+left;
    }
    public  static ArrayList<String > pathRet(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(r> 1&& c>1){
            list.addAll(pathRet(p+'D',r-1,c-1));
        }
        if(r>1){
            list.addAll(pathRet(p+'V',r-1,c));
        }
        if(c>1){
            list.addAll(pathRet(p+'H',r,c-1));
        }
        return list;
    }

    public static  void pathRestrictions(boolean[][] maze,String p,int r,int c){
        if(r==maze.length-1 && c==maze.length-1){
            System.out.print(p+" ");
            return;
        }

        if(!maze[r][c]){
            return;
        }

        if(r<maze.length-1){
            pathRestrictions(maze,p+'D',r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictions(maze,p+'R',r,c+1);
        }
    }
}
