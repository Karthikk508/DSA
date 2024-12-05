package String;

import java.util.Arrays;


public class Reverse {

    public static void main(String[] args) {

        String s = "  hello world  ";

        print(s);


    }
    public static void print(String s)
    {

        int i = 0 , j = s.length()-1;

        String str = "";

        while(i<s.length() && s.charAt(i) == ' ')
        {
            i++;
        }

        while(j >= 0 && s.charAt(j) == ' ')
        {
            j--;
        }

        int count = 0;

        for(int k = j; k>=i; k--)
        {
            if(s.charAt(k) == ' ')
            {
                if(count == 0)
                {
                    str += s.charAt(k);
                    count++;
                }
            }
            if(s.charAt(k) != ' ')
            {
                str += s.charAt(k);
                count = 0;

            }
        }
        System.out.println(str);

        char[] arr = str.toCharArray();

        int n = 0;

        for(int l = 0; l<arr.length; l++)
        {
            if(arr[l]  == ' ')
            {
                reverse(n,l-1,arr);
                n = l+1;
            }
            if(l == arr.length-1)
            {
                reverse(n,l,arr);
            }
        }


        System.out.println(Arrays.toString(arr));

        String ans = new String(arr);

        System.out.println(ans);

    }
    public static void reverse(int start,int end,char[] arr)
    {

        while(start<end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }


}
