package EasyLeetcode;

public class AddString_415 {


    public static void main(String[] args) {

        System.out.println(addStrings("99","9"));



    }
    public static String addStrings(String num1, String num2) {

        if(num2.length() > num1.length())
        {
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        int i = num1.length()-1 , j = num2.length()-1;

        int[] arr = new int[num2.length() + num1.length()+1];

        int carry = 0 , n1 = 0;

        while( i >= 0 && j >= 0)
        {
            int add = (num2.charAt(j) - '0') + (num1.charAt(i) - '0');
            int sum = add + carry;
            carry = sum /10;
            arr[n1++] = sum % 10;
            i--; j--;
        }

        while(i >= 0)
        {
            int add = (num1.charAt(i) - '0');
            int sum  = add+carry;
            arr[n1++] = sum % 10;
            carry = sum/10;
            i--;
        }

        if(carry != 0)
        {
            arr[n1] = carry;
        }

        int l = arr.length-1;
        while(arr[l] == 0 && l > 0)
        {
            l--;
        }
        if(l == -1)
        {
            return "0";
        }
        String str = "";
        for (int k = l; k >= 0 ; k--) {
            char ans = Character.forDigit(arr[k], 10);
            str += ans;
        }
        return str;


    }

}
