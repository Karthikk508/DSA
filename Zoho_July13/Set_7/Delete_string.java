package Set_7;

public class Delete_string {

    public static void main(String[] args) {


        System.out.println(printString("aaaaa",'a',2));

    }
    public static String printString(String s, char ch, int count) {

        // code here

        int count1 = 0 , i = 0;

        for(i = 0; i<s.length(); i++)
        {
            if(s.charAt(i) == ch)
            {
                count1++;
            }
            if(count1 == count) break;
        }

        return s.substring(i+1);
    }
}
