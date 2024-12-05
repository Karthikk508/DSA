package Backtracking;

public class Sudoku_solver {

    public static void main(String[] args) {

        int[][] board = new int[][]{
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };

        if (solve(board)) {
            display(board);
            System.out.println(solve(board));
        } else {
            System.out.println("Cannot solve");
        }


    }
    public static boolean solve(int[][] board)
    {
        int n = board.length;
        int r = -1;
        int c = -1;


        boolean empty_left = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(board[i][j] == 0)
                {
                    r = i;
                    c = j;
                    empty_left = false;
                    break;
                }
            }
            if(!empty_left) break;
        }
        if(empty_left)
        {
            return true;
        }

        for (int number = 1; number <= 9 ; number++) {

            if(isSafe(board,r,c,number))
            {
                board[r][c] = number;
                if(solve(board))
                {
                    return true;
                }
                else{
                    board[r][c] = 0;
                }
            }

        }
        return false;
    }
    public static boolean isSafe(int[][] board,int row, int col, int num)
    {
        //checking the row
        for (int i = 0; i < board.length; i++) {
            if(board[row][i] == num)
            {
                return false;
            }
        }
        //checking the col
        for (int[] nums : board) {
            if (nums[col] == num) {
                return false;
            }
        }
        //checking the squares
        int sqrt = (int) Math.sqrt(board.length);
        int rowStart = row - row % sqrt;
        int colStart = col - col % sqrt;

        for (int r = rowStart; r < rowStart + sqrt; r++) {
            for (int c = colStart; c < colStart + sqrt; c++) {

                if (board[r][c] == num) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void display(int[][] board) {

        for (int[] row : board) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

}
