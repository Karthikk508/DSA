public class Remove_palindrome {

    public static void main(String[] args) {

        String input = "he mm good dead";
        remove(input.toLowerCase());
    }

    public static void remove (String s) {

        int startindex = 0;
        int endindex;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) ==  ' ')
            {
                endindex = i - 1;
                ans += check(s,startindex,endindex);
                startindex = i + 1;
            }

        }
        System.out.println(ans);

    }
    public static String check(String input,int s, int e)
    {
        boolean flag = true ;

        while(s<e)
        {
            if(input.charAt(s) == input.charAt(e))
            {
                s++;
                e--;
            }
            else {
                flag = false;
                break;
            }
        }
        String ans = "";
        if(!flag)
        {
            ans += input.substring(s,e+2);
        }
        return ans;
    }

}
