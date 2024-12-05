package Strings;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    public static void main(String[] args) {
        permutaions("","abc");
        System.out.println(permutaion("","abc"));
    }
    public static void permutaions(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0,i);
            String s = p.substring(i,p.length());
            permutaions(f+c+s, up.substring(1));
        }
    }
    //Return arraylist
    public static List<String> permutaion(String p , String up)
    {
        if(up.isEmpty())
        {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> list = new ArrayList<>();
        char c = up.charAt(0);

        for (int i = 0; i <= p.length(); i++) {

            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            list.addAll(permutaion(f + c + s, up.substring(1)));
        }
        return list;
    }
}
