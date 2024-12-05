public class Palindrome {

    public static void main(String[] args) {

        int n = 121;

        System.out.println(is_palindrome(n));
    }
    public static String is_palindrome(int n)
    {
        // Code here
        int r = 0;
        int org = n;

        while(n > 0)
        {
            int last = n % 10;
            //r += last;
            r = (r * 10) + last;
            n = n/10;
        }
        //r = r/10;

        if(org == r)
        {
            return "Yes";
        }
        return "No";
    }
}