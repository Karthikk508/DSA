package Strings;

import java.util.ArrayList;

public class Subseqs {

    public static void main(String[] args) {

          subseq("","abc");
          System.out.println(subseqA("", "abc"));
//        subseq("","abcd");
//        subseq_Ascii("","hope");
//        System.out.println(subseqAscii("" , "abc"));
//        subseq_Ascii("", "abc");
    }

    public static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p+ch , up.substring(1));
        subseq(p,up.substring(1));
    }

    //Using array

    public static ArrayList<String> subseqA(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseqA(p+ch , up.substring(1));
        ArrayList<String> right = subseqA(p,up.substring(1));

        left.addAll(right);

        return left;

    }
    public static void subseq_Ascii(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq_Ascii(p+ch , up.substring(1));
        subseq_Ascii(p,up.substring(1));
        subseq_Ascii(p + (ch + 0),up.substring(1));

    }
    public static ArrayList<String> subseqAscii(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> first = subseqAscii(p+ch , up.substring(1));
        ArrayList<String> second = subseqAscii(p,up.substring(1));
        ArrayList<String> third = subseqAscii(p + (ch + 0),up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;

    }

}
