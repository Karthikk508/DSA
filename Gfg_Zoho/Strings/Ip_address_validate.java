package Strings;

import java.util.ArrayList;
import java.util.List;

public class Ip_address_validate {


    public static void main(String[] args) {


        String s = "0.0.0.0.";

        System.out.println(isValid(s));


    }

    public static boolean valid(String s)
    {
        boolean isValid = true;

        if(s.isEmpty()) return false;

        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') isValid = false;
        }

        if(!isValid) return false;

        if(s.length() > 1 && s.charAt(0) == '0') isValid = false;

        int num = Integer.parseInt(s);

        if(num < 0 || num > 255)
        {
            isValid = false;
        }

        return isValid;
    }


    public static boolean isValid(String s) {
        // Write your code here

        List<String> arr = new ArrayList<>();
        String temp = "";

        for(int i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == '.')
            {
                arr.add(temp);
                temp = "";
            }
            else{
                temp += s.charAt(i);
            }
        }
        arr.add(temp);

        System.out.println(arr);

        if(arr.size() != 4) return false;

        for(int i = 0; i<arr.size(); i++)
        {
            if(!valid(arr.get(i)))
            {
                return false;
            }
        }

        return true;
    }

}
