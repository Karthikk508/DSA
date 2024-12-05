package Practice;

import java.util.Arrays;

public class Backtrack {

    public static void main(String[] args) {

        boolean[][] maze = {{true,true,true},
                {true,true,true},
                {true,true,true}};

        //path("",maze,0,0);
        int[][] path = new int[maze.length][maze.length];
        find("", maze, 0, 0,path,1);

    }

    public static void find(String p,boolean[][] board, int r,int  c,int[][] path,int step)
    {
        if(r == board.length - 1 && c == board[0].length - 1)
        {
            path[r][c] = step;
            for(int[] arr : path)
            {
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if(!board[r][c])
        {
            return;
        }

        board[r][c] = false;
        path[r][c] = step;

        //Up
        if(r > 0)
        {
            find(p+'U',board,r-1,c,path,step+1);
        }
        //Down
        if(r < board.length-1)
        {
            find(p+'D',board,r+1,c,path,step+1);
        }
        //left
        if(c > 0)
        {
            find(p+'L',board,r,c-1,path,step+1);
        }
        //right
        if(c < board[0].length-1)
        {
            find(p+'R',board,r,c+1,path,step+1);
        }
        board[r][c] = true;
        path[r][c] = 0;
    }

}
