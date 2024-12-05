package Round_2;
import java.util.Scanner;


public class _2_Number_crunching {
    public static void main(String[] args) {


        int num1, num2, base, carry, power, newnum, sum;

        num1 = 123;
        num2 = 234;
        base = 6;


        power = 1;
        carry = 0;
        newnum = 0;

        // Loop to add digits of num1 and num2
        while (num1 / power > 0 || num2 / power > 0) {
            sum = ((num1 / power) % 10 + (num2 / power) % 10) + carry;
            newnum = (sum % base) * power + newnum;
            carry = sum / base;
            power *= 10;
        }

        // If there's any carry left
        if (carry > 0) {
            newnum = carry * power + newnum;
        }

        // Output the result
        System.out.println(newnum);
    }
}
