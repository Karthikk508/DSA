package Subset;

public class Practice {

    public static void main(String[] args) {

        String s = "abc";
        permutation("","abc");

        numberpad("","12");
    }
    public static void permutation(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());
            permutation(s+ch+e,up.substring(1));
        }
    }
    public static void numberpad(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0)-'0';
        for (int i = (digit-1)*3; i < (digit*3); i++) {
            char ch = (char) (97 + i);
            numberpad(p+ch,up.substring(1));
        }
    }
}
