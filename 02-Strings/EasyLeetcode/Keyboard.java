package EasyLeetcode;

import java.util.ArrayList;
import java.util.Arrays;

class Keyboard {

    public static void main(String[] args) {

        String[] arr = {"Hello","Alaska","Dad","Peace"};

        System.out.println(Arrays.toString(findWords(arr)));
    }
    public static String[] findWords(String[] s) {

        ArrayList<String> ans = new ArrayList<>();
        int ind = 0;

        for(int i = 0; i<s.length; i++)
        {
            if(valid(s[i]))
            {
                ans.add(s[i]);
            }
        }

        String[] ans2 = new String[ans.size()];

        for(int i = 0; i<ans.size(); i++)
        {
            ans2[ind++] = ans.get(i);
        }

        return ans2;

    }
    public static boolean valid(String s)
    {
        char[] row1 = {'q','w','e','r','t','y','u','i','o','p'};
        char[] row2 = {'a','s','d','f','g','h','j','k','l'};
        char[] row3 = {'z','x','c','v','b','n','m'};

        char c = s.charAt(0);
        c = Character.toLowerCase(c);

        switch(c)
        {
            case 'q':
            case 'w':
            case 'e':
            case 'r':
            case 't':
            case 'y':
            case 'u':
            case 'i':
            case 'o':
            case 'p':
            {

                for(int i = 1; i<s.length(); i++)
                {
                    int j = 0;
                    boolean flag = true;
                    while(j<row1.length)
                    {
                        if(Character.toLowerCase(s.charAt(i)) == row1[j])
                        {
                            flag = false;
                            break;
                        }
                        j++;
                    }
                    if(flag)
                        return false;
                }
                break;
            }

            case 'a':
            case 's':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            {
                for(int i = 1; i<s.length(); i++)
                {
                    int j = 0;
                    boolean flag = true;
                    while(j<row2.length)
                    {
                        if(Character.toLowerCase(s.charAt(i)) == row2[j])
                        {
                            flag = false;
                            break;
                        }
                        j++;
                    }
                    if(flag)
                        return false;

                }
                break;
            }

            case 'z':
            case 'x':
            case 'c':
            case 'v':
            case 'b':
            case 'n':
            case 'm':
            {

                for(int i = 1; i<s.length(); i++)
                {
                    int j = 0;
                    boolean flag = true;
                    while(j<row3.length)
                    {
                        if(Character.toLowerCase(s.charAt(i)) == row3[j])
                        {
                            flag = false;
                            break;
                        }
                        j++;
                    }
                    if(flag)
                        return false;

                }
                break;
            }
            default:
                return false;

        }
        return true;
    }
}