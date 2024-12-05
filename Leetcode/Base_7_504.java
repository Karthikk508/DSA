public class Base_7_504 {
    public static void main(String[] args) {

        System.out.println(convertToBase7(5624));

    }
    public static String convertToBase7(int n) {

        int ans1 = 0;
        while (n >= 7)
        {
            int digit = n % 7;
            n = n / 7;
            ans1 += digit;
            ans1 *= 10;
        }
        ans1 += n;
        System.out.println(ans1);
        String ans2 = String.valueOf(ans1);
        return ans2;

    }
}