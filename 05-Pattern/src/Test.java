import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        //pattern2(9,9);

        patternI(2,6);

    }

    public static void pattern(int n,int m) {

        int original = n;
        n = 2*n;
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= m; col++) {
                int at_Every_index = original-Math.min(Math.min(row,col),Math.min(n-col,n-row));

                System.out.print(at_Every_index);
            }
            System.out.println();
        }
    }
    public static void pattern1(int m , int n)
    {
        for (int i = 0; i < n; i++) {

            if(i == 1 || i == n - 2)
            {
                for (int j = 0; j < m; j++) {

                    if(j == 0 || j == m - 1)
                    {
                        System.out.print("X");
                    }
                    else {
                        System.out.print("O");
                    }
                }
                System.out.println();
            }
            else {

                if(i == 0 || i == n-1)
                {
                    for (int j = 0; j < m; j++) {
                        System.out.print("X");
                    }
                    System.out.println();
                }
                else {
                    for (int j = 0; j < m; j++) {

                        if(j == 1 || j == m - 2)
                        {
                            System.out.print("O");
                        }
                        else {
                            System.out.print("X");
                        }

                    }
                    System.out.println();
                }

            }
        }
    }

    public static void pattern2( int n,int m)
    {

        int rows = n;
        int cols = m;


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Check for borders
                if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
                    System.out.print('X');
                }
                // Check for diagonals
                else if (i == j || i + j == cols - 1) {
                    System.out.print('X');
                }
                // Fill the remaining space with 'O'
                else {
                    System.out.print('O');
                }
            }
            System.out.println(); // Move to the next line after each row
        }

    }

    public static void patternI( int n,int m)
    {

        char[][] arr = new char[n][m];

        int top = 0 , bottom = n-1;
        int left = 0 , right = m-1;

        int count = 0;

        while(top <= bottom && left <= right)
        {
            for(int i = left; i<=right; i++)
            {
                if(count % 2 == 0)
                {
                    arr[top][i] = 'X';
                }
                else {
                    arr[top][i] = 'O';
                }

            }
            top++;
            for(int i = top; i<=bottom; i++)
            {
                arr[i][right] = 'O';

                if(count % 2 == 0)
                {
                    arr[i][right] = 'X';
                }
                else {
                    arr[i][right] = 'O';
                }
            }
            right--;

            if(top <= bottom)
            {
                for(int i = right; i>=left; i--)
                {
                    if(count % 2 == 0)
                    {
                        arr[bottom][i] = 'X';
                    }
                    else {
                        arr[bottom][i] = 'O';
                    }
                }
            }
            bottom--;

            if(left <= right)
            {
                for(int i = bottom; i>=top; i--)
                {
                    if(count % 2 == 0)
                    {
                        arr[i][left] = 'X';
                    }
                    else {
                        arr[i][left] = 'O';
                    }
                }
            }
            count++;
            left++;
        }

        for (char[] chars : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(chars[j] + " ");
            }
            System.out.println();
        }

    }
}
