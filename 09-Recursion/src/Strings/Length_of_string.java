package Strings;
import java.util.*;

public class Length_of_string{

    static int sum = 0;
    private static int recLen(String str)
    {
        if (str.equals(""))
            return 0;
        else
            return recLen(str.substring(1)) + 1;
    }

    public static void main(String[] args)
    {
        String str ="GeeksforGeeks";
       // System.out.println(str.substring(1));
        System.out.println(recLen(str));
    }
}
