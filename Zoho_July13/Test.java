import java.util.List;

public class Test {

    public void greetings()
    {
        System.out.println("Vanakkam");
    }

    public static void main(String[] args) {

//        generate(0,4,"0");
//        generate(0,4,"1");

        print(0,"122","");

        Test obj = new Test();
        obj.greetings();

    }

    public static void generate(int ind,int n,String p)
    {
        if(p.length() == n)
        {
            System.out.println(p);
            return;
        }

        generate(ind+1,n,p+'0');

        if(p.charAt(ind) != '1')
        {
            generate(ind+1,n,p+'1');
        }

    }
    public static void print(int ind, String s,String p)
    {

        if(ind == s.length())
        {
            System.out.println(p);
            return;
        }

        for (int i = ind; i < s.length(); i++) {

            if(isValid(s,ind,i))
            {
                String next = convert(s.substring(ind,i+1));
                print(i+1,s,p+next);
            }
        }

    }
    public static boolean isValid(String s, int ind, int i) {
        int in = Integer.parseInt(s.substring(ind, i + 1));
        return in >= 1 && in <= 26;
    }
    public static String convert(String s) {
        int in = Integer.parseInt(s);
        char c = (char) (64 + in);
        return String.valueOf(c);
    }
}
