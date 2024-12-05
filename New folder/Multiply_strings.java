import java.util.Arrays;
import java.util.Scanner;

public class Multiply_strings {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

//        System.out.println("Enter the 1st string : ");
//        String s1 = in.next();
//        System.out.println("Enter the 2nd string : ");
//        String s2 = in.next();

        System.out.println(calculate("11","23"));
    }
    public static String calculate(String s1, String s2)
    {

        int len1 = s1.length();
        int len2 = s2.length();
        if (len1 == 0 || len2 == 0)
            return "0";


        int result[] = new int[len1 + len2];

        int i_n1 = 0;
        int i_n2 = 0;

        for (int i = len1 - 1; i >= 0; i--)
        {
            int carry = 0;
            int n1 = s1.charAt(i) - '0';

            i_n2 = 0;


            for (int j = len2 - 1; j >= 0; j--)
            {

                int n2 = s2.charAt(j) - '0';

                int sum = n1 * n2 + result[i_n1 + i_n2] + carry;

                carry = sum / 10;

                result[i_n1 + i_n2] = sum % 10;

                i_n2++;
            }


            if (carry > 0)
                result[i_n1 + i_n2] += carry;

            i_n1++;
        }


        int i = result.length - 1;
        while (i >= 0 && result[i] == 0)
            i--;


        if (i == -1)
            return "0";

        String s = "";

        while (i >= 0)
            s += (result[i--]);

        return s;


    }
}
