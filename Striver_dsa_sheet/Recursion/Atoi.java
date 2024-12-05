package Recursion;

///Example for returning integer;;;;;

class Atoi {

    //Rcursion

    public static void main(String[] args) {

        System.out.println(myAtoi("   -2224"));


    }
    private static final int INT_MAX = Integer.MAX_VALUE;
    private static final int INT_MIN = Integer.MIN_VALUE;

    private static long atoi(String s, int sign, int i, long result) {

        if (sign * result >= INT_MAX) {
            return INT_MAX;
        }
        if (sign * result <= INT_MIN) {
            return INT_MIN;
        }
        if (i >= s.length() || s.charAt(i) < '0' || s.charAt(i) > '9') {
            return sign * result;
        }

        result = atoi(s, sign, i + 1, result * 10 + (s.charAt(i) - '0'));

        return result;
    }

    public static int myAtoi(String s) {

        int i = 0;
        int n = s.length();
        int sign = 1;

        // Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // Check for optional sign
        if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (i < n && s.charAt(i) == '+') {
            i++;
        }

        return (int) atoi(s, sign, i, 0);
    }
}
