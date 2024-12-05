package Practice;

import java.util.Arrays;

public class N_Queens {

    public static void main(String[] args) {

        boolean[][] board = new boolean[4][4];
        queens(0,board);

    }
    public static void queens(int row,boolean[][] board)
    {
        if(row == board.length)
        {
            System.out.println();
            display(board);
            return;
        }

        for (int col = 0; col < board.length; col++) {

            if(isValid(row,col,board))
            {
                board[row][col] = true;
                queens(row+1,board);
                board[row][col] = false;
            }
        }
    }

    private static boolean isValid(int row, int col, boolean[][] board) {

        //vertical
        for (int i = 0; i < row; i++) {
            if(board[i][col])
            {
                return false;
            }
        }
        //diagonal left
        int maxLeft = Math.min(row,col);
        for (int i = 1; i <= maxLeft; i++) {
            if(board[row-i][col-i]) {
                return false;
            }
        }
        //diagonal right
        int maxRight = Math.min(row,(board.length-col-1));
        for (int i = 1; i <= maxRight ; i++) {
            if(board[row-i][col+i])
            {
                return false;
            }
        }
        return true;
    }
    private static void display(boolean[][] board) {

        for (boolean[] booleans : board) {

            for (int j = 0; j < board[0].length; j++) {

                if (booleans[j]) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
