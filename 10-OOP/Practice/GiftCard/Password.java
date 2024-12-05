package Practice.GiftCard;

public class Password {
    public static String encrypt(String s)
    {
        String en="";
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(ch=='z') {
                ch='a';
            }
            else if(ch=='Z') {
                ch='A';
            }
            else if(ch=='9') {
                ch='0';
            }
            else {
                ch++;
            }
            en=en+ch;
        }
        return en;
    }
}
