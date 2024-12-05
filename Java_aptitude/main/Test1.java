package main;

public class Test1
{
    public static void main(String args[])
    {
        short s = 0;
        int x = 07;
        int y = 8;
        int z = 112345;

        s += z;
        System.out.println("" + x + y + s);

        pattern(10,20);
    }
    public static void pattern(int m , int n)
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
} //end class
