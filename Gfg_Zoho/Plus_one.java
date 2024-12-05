import java.util.Arrays;
public class Plus_one {
    public static void main(String[] args) {
        int[] digits = {1,8,9};
        int[] result = plusOne2(digits);
        System.out.println("Result: " + Arrays.toString(result));
    }
    //Method 1
    public static int[] plusOne(int[] digits) {
        int carry = 1;
        int n = digits.length;
        int[] res = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            if (sum >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            res[i] = sum % 10;
        }

        if (carry == 1) {
            res = new int[n + 1];
            res[0] = 1;
        }
        return res;
    }
    //Method 2
    public static int[] plusOne2(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}

