package Strings;

public class Roman_to_integer {


    public static void main(String[] args) {

        System.out.println(convert("VIII"));

    }
    public static int convert(String str)
    {
        int result = 0;
        int prevValue = 0;

        // Iterate through the string from right to left
        for (int i = str.length() - 1; i >= 0; --i) {
            int value = roman(str.charAt(i));

            // If the value of the current symbol is less than the previous one,
            // subtract it from the result; otherwise, add it to the result
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            // Update the previous value for the next iteration
            prevValue = value;
        }

        return result;
    }
    public static int roman(char ch)
    {
        switch (ch)
        {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;

            default:
                return -1;

        }
    }
}