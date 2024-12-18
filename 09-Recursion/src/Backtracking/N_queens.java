package Backtracking;

public class N_queens {

    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];
        System.out.println(queens(board,0));
        
    }
    public static int queens(boolean[][] board,int r)
    {
        if(board.length == r)
        {
            display(board);
            return 1;
        }

        int count = 0;

        for (int c = 0; c < board.length; c++) {
            
            if(isSafe(board,r,c)){
                board[r][c] = true;
                count  +=  queens(board,r+1);
                board[r][c] = false;
            }
        }

        return count;
    }

    public static boolean isSafe(boolean[][] board, int r, int c) {

        //top
        for (int i = 0; i < r; i++) {
            if(board[i][c])
            {
                return false;
            }
        }
        //left
        int max_l = Math.min(r,c);
        for (int i = 1; i <= max_l; i++) {

            if(board[r-i][c-i])
            {
                return false;
            }
        }
        //right
        int max_r = Math.min(r,board.length-c-1);
        for (int i = 1; i <= max_r; i++) {
            if(board[r-i][c+i])
            {
                return false;
            }
        }
        return true;
    }

    private static void display(boolean[][] board) {

        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }


}
