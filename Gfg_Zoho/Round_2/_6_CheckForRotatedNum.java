package Round_2;

import java.util.*;


public class _6_CheckForRotatedNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        long num1, num2, power, nod, rotate;
        num1 = 12345;
        num2 = 54123;

        power = 1;
        nod = 0;

        int digit = (int)Math.log10(num1);


        System.out.println(digit);

        // Calculate number of digits in num1
        long temp = num1;
        while (temp > 0) {
            power *= 10;
            nod++;
            temp /= 10;
        }
        power /= 10; // reduce power by one position for correct rotation
        rotate = num1;

        System.out.println(nod);

        // Perform rotation and check if num2 matches any rotated version of num1
        while (rotate != num2 && nod > 0) {
            rotate = (rotate % 10) * power + (rotate / 10);
            nod--;
        }

        // Output the result
        if (rotate == num2 && nod != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
