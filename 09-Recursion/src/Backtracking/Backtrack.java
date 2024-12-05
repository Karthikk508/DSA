package Backtracking;
import java.util.*;
public class Backtrack {

    public static void main(String[] args) {

        boolean[][] maze = {{true,true,true},
                            {true,true,true},
                            {true,true,true}};

        //path("",maze,0,0);
        int[][] arr = new int[maze.length][maze.length];
        all_path("", maze, 0, 0,arr, 1);
    }

    public static void path(String p,boolean[][] arr, int r ,int c)
    {

        if(r == arr.length-1 && c == arr.length-1)
        {
            System.out.println(p);
            return;
        }

        if(!arr[r][c]){
            return;
        }

        arr[r][c] = false;

        //up
        if(r<arr.length-1)
        {
            path(p+'D',arr,r+1,c);
        }
        //down
        if(r > 0)
        {
            path(p+'U',arr,r-1,c);
        }
        //right
        if(c < arr[0].length-1)
        {
            path(p+'R',arr,r,c+1);
        }
        //left
        if(c > 0)
        {
            path(p+'L',arr,r,c-1);
        }

        arr[r][c] = true;

    }
    public static void all_path(String p, boolean[][] arr, int r , int c, int[][] path, int step)
    {

        if(r == arr.length-1 && c == arr.length-1)
        {
            path[r][c] = step;
            System.out.println(p);
            for(int[] Arr : path)
            {
                System.out.println(Arrays.toString(Arr));
            }
            return;
        }

        if(!arr[r][c]){
            return;
        }

        arr[r][c] = false;
        path[r][c] = step;

        if(r<arr.length-1)
        {
            all_path(p+'D',arr,r+1,c,path,step+1);
        }
        if(c < arr.length-1)
        {
            all_path(p+'R',arr,r,c+1,path,step+1);
        }
        if(r > 0)
        {
            all_path(p+'U',arr,r-1,c,path,step+1);
        }
        if(c > 0)
        {
            all_path(p+'L',arr,r,c-1,path,step+1);
        }

        arr[r][c] = true;
        path[r][c] = 0;

    }
}
