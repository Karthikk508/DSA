public class Qn_2 {

    public static void main(String[] args) {

        find("455454");


    }
    public static void find(String str)
    {

        String ans = "";

        int count = 0;

        ans += str.charAt(0) + ".";

        for (int i = 1; i < str.length(); i++) {

            if(count == 2)
            {
                ans += ".";
                count = 0;
                while(i < str.length() && count < 3)
                {
                    count++;
                    ans += str.charAt(i);
                    i++;
                }
                if(i != str.length()) ans += '.';
                i--;
                count = 0;
            }
            else {
                ans += str.charAt(i);
                count++;
            }
        }

        System.out.println(ans);
    }
}
