package Bit_manipulation;

public class Number_steps_to_reduce {

    public static void main(String[] args) {

        String s = "110101010101";
        System.out.println(numSteps(s));

        int n =  5;
        System.out.println(n >> 1);

    }
    public static int numSteps(String s) {
        int res = 0, carry = 0;
        for (int i = s.length() - 1; i > 0; --i) {
            ++res;
            if (s.charAt(i) - '0' + carry == 1) {
                carry = 1;
                ++res;
            }
        }
        return res + carry;
    }
}
