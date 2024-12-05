package Strings;

public class First_letter_uppercase {

    public static void main(String[] args) {


        String s = "i love programming";
        System.out.println(s.length());
        System.out.println(transform(s));

    }

    public static String transform(String s)
    {

        String ans = "";

        int i = 0;

        while(i<s.length()-1)
        {
            if(i==0)
            {
                ans += Character.toUpperCase(s.charAt(i));
                i++;
            }
            if(s.charAt(i) == ' ' && s.charAt(i) != '\0')
            {
                ans += ' ';
                i++;
                ans += Character.toUpperCase(s.charAt(i));

            }
            else
            {
                i++;
                if( s.charAt(i) != ' ') {
                    ans += s.charAt(i);
                }

            }
        }

        return ans;

        // code here
        // return upper(s,"",0);
    }
}