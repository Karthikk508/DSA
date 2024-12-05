package Practice;

import java.util.ArrayList;
import java.util.List;

public class Maze {

    public static void main(String[] args) {
        System.out.println(count(3,3));
        System.out.println(path("",3,3));
        System.out.println(pathDiagonal("",3,3));

        
    }
    public static int count(int r, int c)
    {
        if(r == 1 || c == 1)
        {
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);

        return left+right;
    }
    public static List<String> path(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            List<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }

        List<String> list = new ArrayList<>();

        if(r > 1)
        {
            list.addAll(path(p+'D',r-1,c));
        }
        if(c > 1)
        {
            list.addAll(path(p+'R',r,c-1));
        }

        return list;
    }
    public static List<String> pathDiagonal(String p, int r, int c)
    {
        if(r==1 && c==1)
        {
            List<String> arr = new ArrayList<>();
            arr.add(p);
            return arr;
        }

        List<String> list = new ArrayList<>();

        if(r > 1 && c > 1)
        {
            list.addAll(pathDiagonal(p+'D',r-1,c-1));
        }

        if(r > 1)
        {
            list.addAll(pathDiagonal(p+'V',r-1,c));
        }
        if(c > 1)
        {
            list.addAll(pathDiagonal(p+'H',r,c-1));
        }

        return list;
    }
    public static void pathRestrictions(String p,boolean[][] maze, int r, int c)
    {
        if(r== maze.length-1 && c==maze[0].length-1)
        {
            System.out.println(p);
            return;
        }

        if(r < maze.length)
        {
            pathRestrictions(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length)
        {
            pathRestrictions(p+'R',maze,r,c+1);
        }

    }
}
