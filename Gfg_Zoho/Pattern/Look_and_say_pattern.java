package Pattern;

public class Look_and_say_pattern {

    public static void main(String[] args) {

        System.out.println(lookAndSay(5));


    }
    public static String lookAndSay(int n) {

        String str = "1";

        for(int i = 1; i<n; i++)
        {
            int count = 1;
            String temp = "";

            for(int j = 0; j<str.length(); j++)
            {
                if(j+1<str.length() && str.charAt(j) == str.charAt(j+1))
                {
                    count++;
                }
                else
                {
                    temp += count +""+ str.charAt(j);
                    count = 1;
                }
            }
            str = temp;
        }
        return str;
    }
}
