public class Qn_1 {


    public static void main(String[] args) {

        find("1234567878");


    }
    public static void find(String str)
    {

        System.out.println(425 % 365);

        String ans = "";

        int count = 1;

        for (int i = 0; i < str.length(); i++) {

            if(count == 2)
            {
                ans += ".";
                count = 0;
            }
            else {
                ans += str.charAt(i);
                count++;
            }
        }

        System.out.println(ans);
    }
}
