package Strings;

public class Binary_string {


    public static void main(String[] args) {


        generate(4,"0",1);
        generate(4,"1",1);
    }
    public static void generate(int k,String p,int n)
    {
        if(k == p.length())
        {
            System.out.println(p);
            return;
        }

        if(!p.isEmpty() && p.charAt(n-1) == '1')
        {
            generate(k,p+'0',n+1);
            return;
        }

        generate(k,p+'0',n+1);
        generate(k,p+'1',n+1);

    }
}
