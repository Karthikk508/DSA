import java.util.Scanner;

public class _02_Sober_walk {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        walk(n);
    }
    public static void walk(int n)
    {
        char c = 'R';
        int distance = 10;
        int x = 0 , y = 0;
        while(n>0)
        {
            switch(c)
            {
                case 'R':
                    x += distance;
                    distance += 10;
                    c = 'U';
                    break;

                case 'U':
                    y += distance;
                    distance += 10;
                    c  = 'L';
                    break;

                case 'L':
                    x -= distance;
                    distance += 10;
                    c = 'D';
                    break;

                case 'D':
                    y -= distance;
                    distance += 10;
                    c = 'A';
                    break;

                case 'A':
                    x += distance;
                    distance+= 10;
                    c = 'R';
                    break;
            }
            n--;
        }

        System.out.println("x = " + x + " y = " + y );

    }
}
