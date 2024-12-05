package Set_7;

public class Look_and_say {

    public static void main(String[] args) {

        System.out.println(lookandsay(5));
    }
    public static String lookandsay(int n) {
        //your code here

        String temp = "1";

        for(int i = 0; i<n; i++)
        {
            int count; String str = "";
            for(int j = 0; j<temp.length(); j++)
            {
                count = 1;
                while(j < temp.length()-1 && temp.charAt(j) == temp.charAt(j+1))
                {
                    j++;
                    count++;
                }

                str += count + "" + temp.charAt(j);
            }
            temp = str;
        }

        return temp;

    }

}
