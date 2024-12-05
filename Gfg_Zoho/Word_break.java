import java.util.ArrayList;

public class Word_break {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("ab");
        arr.add("bcd");
        arr.add("b");
        arr.add("a");

        String s = "abcd";

        System.out.println(wordBreak(s,arr));


    }
    public static int wordBreak(String s, ArrayList<String> d )
    {
        //code here

        for(int i = 0; i<d.size(); i++)
        {
            String ans;
            for(int j = 0; j<d.size(); j++)
            {
                ans = d.get(i);
                ans += d.get(j);

                if(ans.equals(s))
                {
                    return 1;
                }
                ans = "";
            }
        }
        return 0;
    }
}