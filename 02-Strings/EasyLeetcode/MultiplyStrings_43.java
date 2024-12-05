package EasyLeetcode;

import java.util.Arrays;

public class MultiplyStrings_43 {

    public static void main(String[] args) {

        System.out.println(addStrings("0","0"));



    }
    public static String addStrings(String num1, String num2) {

        if(num2.length() > num1.length())
        {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int len = num2.length() + num1.length();

        int[] arr = new int[num2.length() + num1.length()+1];

        int carry;

        int n2 = 0;

        for(int i = num2.length()-1; i >= 0; i--)
        {
            int n1 = n2;  carry = 0;
            for(int j = num1.length()-1; j >= 0; j--)
            {
                int mul = (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
                int sum = arr[n1] + mul + carry;
                carry = sum / 10;

                arr[n1++] = sum%10;
            }
            arr[n1] = carry;
            n2++;
        }

        System.out.println(Arrays.toString(arr));

        int i = arr.length-1;

        while(arr[i] == 0 && i >= len)
        {
            i--;
        }

        String str = "";

        for (int j = i; j >= 0 ; j--) {

            char ans = Character.forDigit(arr[j], 10);

            str += ans;

        }

        return str;

    }
}
