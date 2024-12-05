package Strings;

public class Stream {
    public static void main(String[] args) {

        String ch = "aaaacknowappedgeaaapple";
        skip("",ch);
    }
    //Without returning //
    public static void skip(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if('a' == ch || 'c' == ch)
        {
            skip(p,up.substring(1));
        }
        else {

            skip(p + ch,up.substring(1));
        }
    }
    // With return type //
    public static String skip(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch = up.charAt(0);

        if('a' == ch || 'c' == ch)
        {
            return skip(up.substring(1));
        }
        else {
            return ch + skip(up.substring(1));
        }
    }
    public static String skip_apple(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }

        if(up.startsWith("apple"))
        {
            return skip_apple(up.substring(5));
        }
        else {
            return up.charAt(0) + skip_apple(up.substring(1));
        }
    }
    public static String skip_Not_apple(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }

        if(!up.startsWith("apple") && up.startsWith("app") )
        {
            return skip_Not_apple(up.substring(3));
        }
        else {
            return up.charAt(0) + skip_Not_apple(up.substring(1));
        }
    }
}
