import java.util.Scanner;

public class _06_Count_sundays {
    public static void main(String[] args) {

        String[] s = {"sun","mon","tue","wed","thurs","fri","sat"};

        Scanner in = new Scanner(System.in);

        String k = in.nextLine();

        int n = in.nextInt();

        int i ;
        for ( i = 0; i < s.length; i++) {

            if(s[i].equals(k))
            {
                break;
            }
        }

        int rem = 6 - i;

        int res = 1;

        n -= rem;

        if(n>0)
        {
            res += n/7;
        }

        System.out.println(res);

    }
}
