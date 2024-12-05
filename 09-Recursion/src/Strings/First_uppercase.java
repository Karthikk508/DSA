package Strings;
import java.util.*;
public class First_uppercase {

    public static void main(String[] args) {

        String s = "senophile";
        System.out.println(first(s,0));
    }
    public static char first(String s,int i)
    {
        if(Character.isUpperCase(s.charAt(i)))
        {
            return s.charAt(i);
            //Character.toUpperCase()
        }
        else
        {
            return first(s,i+1);
        }
    }
}
