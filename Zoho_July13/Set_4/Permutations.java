package Set_4;

public class Permutations {

    public static void main(String[] args) {

        generate("","abc");


    }
    public static void generate(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }


        for(int i = 0; i<p.length()+1; i++)
        {
            String f = p.substring(0,i);
            String s = p.substring(i,p.length());

            char ch = up.charAt(0);

            generate(f+ch+s,up.substring(1));
        }
    }
}
