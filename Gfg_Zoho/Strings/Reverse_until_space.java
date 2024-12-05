package Strings;


public class Reverse_until_space
{

    public static void main(String[] args) {

        String s = "Help others";
        System.out.println(reverseWithSpacesIntact(s));
    }
    public static String reverseWithSpacesIntact(String S)
    {
        // your code here

        char[] temp = S.toCharArray();

        int i = 0 ,j = S.length() - 1;

        while(i<j)
        {
            if(temp[i] == ' ')
            {
                i++;
                continue;
            }
            if( temp[j] == ' ')
            {
                j++;
                continue;
            }
            swap(temp,i,j);
            i++;
            j--;
        }

        return new String(temp);
    }
    static void swap(char[] temp,int i,int j)
    {
        char temp1 = temp[i];
        temp[i] = temp[j];
        temp[j] = temp1;
    }
}