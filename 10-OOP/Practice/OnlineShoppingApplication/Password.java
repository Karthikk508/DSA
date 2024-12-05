package Practice.OnlineShoppingApplication;

public class Password {

    public static String encrypt(String password)
    {
        String en = "";

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if(ch== 'z')
            {
                ch = 'a';
            }
            else if(ch == '9')
            {
                ch = '0';
            }
            else if(ch == 'Z')
            {
                ch = 'A';
            }
            else {
                ch++;
            }
            en += ch;
        }
        return en;
    }
}
