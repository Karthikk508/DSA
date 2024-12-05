package Backtracking;

import java.util.ArrayList;

public class Maze {

    public static void main(String[] args) {

        //System.out.println(count(3,3));
        //path("",3,3);
        //System.out.println(path_list("",3,3));
        //path_diagonal("",3,3);
        boolean [][] board = {{true,true,true},
                              {true,false,true},
                              {true,true,true} };
        path_restriction("",0,0,board);
    }
    public static int count(int r,int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return right+left;
    }
    public static void path(String p,int r,int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r > 1)
        {
            path(p+'D',r-1,c);
        }
        if(c > 1)
        {
            path(p+'R',r,c-1);
        }
    }
    public static void path_diagonal(String p,int r,int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r > 1 && c > 1)
        {
            path_diagonal(p+'D',r-1,c-1);
        }
        if(r > 1)
        {
            path_diagonal(p+'V',r-1,c);
        }
        if(c > 1)
        {
            path_diagonal(p+'H',r,c-1);
        }
    }

    public static void path_restriction(String p,int r,int c,boolean [][] maze)
    {
        if(maze.length-1 == r && maze.length-1 == c)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        if(r < maze.length-1)
        {
            path_restriction(p+'D',r+1,c,maze);
        }
        if(c < maze.length-1)
        {
            path_restriction(p+'R',r,c+1,maze);
        }
    }

    public static ArrayList<String> path_list(String p, int r, int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if(r > 1)
        {
            list.addAll(path_list(p+'D',r-1,c));
        }
        if(c > 1)
        {
            list.addAll(path_list(p+'R',r,c-1));
        }
        return list;
    }

}
