public class Qn_5 {

    public static void main(String[] args) {
        print("","abcd");
    }
    public static void print(String p,String up)
    {
        if(up.isEmpty())
        {
            if(p.length() % 2 == 0)
            {
                System.out.println(p);
            }

            return;
        }
        char ch = up.charAt(0);
        print(p+ch,up.substring(1));
        print(p,up.substring(1));
    }
}
