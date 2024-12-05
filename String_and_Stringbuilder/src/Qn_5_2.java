public class Qn_5_2 {

    public static void main(String[] args) {

        print("abcd");

    }
    public static void print(String str)
    {
        for (int i = 0; i < str.length(); i++) {
            String ans = "";
            for (int j = i; j < str.length(); j++) {
                ans += str.charAt(j);
                if(ans.length() % 2 == 0)
                {
                    System.out.println(ans);
                }
            }

        }

    }
}
