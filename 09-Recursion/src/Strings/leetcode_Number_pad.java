package Strings;

import java.util.ArrayList;

public class leetcode_Number_pad {

    public static void main(String[] args) {

        number("","12");
        System.out.println(number_list("","12"));

    }
    public static void number(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';
        for (int i = ((digit-1) * 3); i < (digit * 3)  ; i++) {
            char ch = (char) ('a' + i);
            number(p + ch, up.substring(1));
        }
    }
    public static ArrayList<String> number_list(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0';
        for (int i = ((digit-1) * 3); i < (digit * 3)  ; i++) {
            char ch = (char) ('a' + i);
            ans.addAll(number_list(p + ch, up.substring(1)));
        }
        return ans;
    }
}
