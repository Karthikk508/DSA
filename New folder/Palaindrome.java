import java.util.ArrayList;
import java.util.Arrays;

public class Palaindrome {
    public static void main(String[] args) {

        String s = "abababccc";
        System.out.println(check(s));

    }
    public static boolean check(String s)
    {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) -'a'] = arr[s.charAt(i)-'a']+1;
        }
        int sum = 0 ;
        boolean flag = false;
        for (int j : arr) {
            if(j % 2 == 0)
            {
                flag = true;
            }
            sum += j;
        }

        System.out.println(Arrays.toString(arr));
        if(flag)
        {
            return true;
        }
        else
        {
            if(sum % 2 == 1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }


    }
}
