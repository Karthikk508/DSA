package Set_2;

public class Encrypted_message {

    public static void main(String[] args) {

        encrypt("abcd",4);

    }
    public static void encrypt(String s, int k)
    {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            ans += find(s.charAt(i),k);
        }

        System.out.println(ans);

    }

    private static char find(char c, int k) {


        if(c == ' ')
        {
            return ' ';
        }

        if( c >= '0' && c <= '9')
        {
            int n = c - '0';
            return (char) (n+k);
        }

        int i = ((c - 97)+k) % 26;

        return (char)(i+97);

    }
}
