import java.util.Scanner;

public class _01_Question_1_Sweet_17 {

    public static int con(char s)
    {
        if(s == 'a' || s == 'A')
        {
            return 10;
        }
        else if(s == 'b' || s == 'B')
        {
            return 11;
        }
        else if(s == 'c' || s == 'C')
        {
            return 12;
        }
        else if(s == 'd' || s == 'D')
        {
            return 13;
        }
        else if(s == 'e' || s == 'E')
        {
            return 14;
        }
        else if(s == 'f' || s == 'F')
        {
            return 15;
        }
        else
        {
            return 16;
        }
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        long num = 0;
        int p = 0;

        for (int i = s.length()-1; i >= 0; i--) {

            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
            {
                num += con(s.charAt(i)) * (long) Math.pow(17,p++);
            }
            else
            {
                num += (s.charAt(i) - '0') * (long) Math.pow(17,p++);
            }

        }
        System.out.println(num);
    }
}
