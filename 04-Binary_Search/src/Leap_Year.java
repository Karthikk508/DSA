import java.util.Scanner;

public class Leap_Year{
    public static void main(String[] args) {

        int year;
        Scanner in = new Scanner(System.in);
        boolean ans = false;
        year = in.nextInt();
        if(year % 4 == 0)
        {
            if(year % 100 == 0)
            {
                ans = year % 400 == 0;
            }
            else
            {
                ans = true;
            }
        }

        if(ans)
        System.out.println("It is an leap year");

        else System.out.println("It is an non leap year");


    }
}
