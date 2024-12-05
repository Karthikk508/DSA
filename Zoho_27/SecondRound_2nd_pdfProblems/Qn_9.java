package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class Qn_9 {

    //reverse the word in the string


    public static void main(String[] args) {


        String string1 = "This is a test string only";
        String string2 = "st";


        reverse(string1,string2);





    }
    public static void reverse(String str1,String str2)
    {
        int spaces = 0 ,k = 0,start = 0;

        for(int i = 0; i<str1.length(); i++)
        {
            if(str1.charAt(i) ==  ' ')
            {
                spaces++;
            }

            if(str1.charAt(i) == str2.charAt(0))
            {
                k = 0;
                int j = i;

                while(j<str1.length() && str1.charAt(j) != ' ')
                {
                    if(str1.charAt(j) == str2.charAt(k))
                    {
                        k++;
                    }
                    if(k == str2.length()){
                        start = spaces;
                        break;
                    }
                    j++;
                }
            }
            if(k == str2.length()){
                break;
            }
        }

        String[] arr = str1.split(" ");


        int l = start , m = arr.length-1;

        while(l < m)
        {
            String temp = arr[l];
            arr[l] = arr[m];
            arr[m] = temp;
            l++;
            m--;
        }

        System.out.println(Arrays.toString(arr));

        String ans = "";

        for (int i = 0; i < arr.length; i++) {

            ans += arr[i];
            ans += " ";

        }

        System.out.println(ans);

    }
}
