// Java code for Pascal's Triangle
import java.io.*;

class GFG {

    // Function to print first
    // n lines of Pascal's Triangle
    public static void main(String args[])
    {
        int n = 9;
        printPascal(n);
        printPascalll(n);
    }
    static void printPascal(int n)
    {

        // Iterate through every line
        // and print entries in it
        for (int line = 0; line < n; line++)
        {

            for (int s = 0; s < n-line; s++) {
                System.out.print(" ");
            }
            // Every line has number of
            // integers equal to line number
            for (int i = 0; i <= line; i++)
                System.out.print(binomialCoeff(line, i)+" ");

            System.out.println();
        }
    }

    // Link for details of this function
    // https://www.geeksforgeeks.org/space-and-time-efficient-binomial-coefficient/
    static int binomialCoeff(int n, int k)
    {
        int res = 1;

        if (k > n - k)
           k = n - k;

        for (int i = 0; i < k; ++i)
        {

            res *= (n - i);
            res = res / (i + 1);
        }
        return res;
    }

    //////////////// another approach

    // Java program for Pascal's Triangle
    // A O(n^2) time and O(1) extra
    // space method for Pascal's Triangle
    //Pascal function
    public static void printPascalll(int n)
    {
        for(int line = 1; line <= n; line++)
        {

            for (int s = 0; s < n-line; s++) {
                System.out.print(" ");
            }
            int C=1;                                      // used to represent C(line, i)
            for(int i = 1; i <= line; i++)
            {
                // The first value in a line is always 1
                System.out.print(C+" ");
                C = C * (line - i) / i;
            }
            System.out.println();
        }
    }




}






