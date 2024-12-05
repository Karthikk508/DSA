public class Find_the_string {


    public static void main(String[] args) {

        String str = "c3f5";
        print(str);

    }
    public static void print(String str)
    {

        String ans = "";
        char start = 'a';
        String num = "";

        for(int i = 0; i<str.length(); i++)
        {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                start = str.charAt(i);
                num = "";
            }
            else {
                int count = 0 , k = (start-'a');

                while(i < str.length() && (str.charAt(i) >= '0' && str.charAt(i) <= '9'))
                {
                    num += str.charAt(i);
                    i++;
                }
                i--;

                int n = Integer.parseInt(num);


                while(count < n)
                {
                    ans += (char) (k + 97);
                    k++;
                    k = k % 26;
                    count++;
                }
                ans += " ";
            }
        }
        System.out.println(ans);
    }
}
