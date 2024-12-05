package Set_7;

class Validate_IPaddress {


    public static void main(String[] args) {

        String str = "98.80.224.423";

        System.out.println(isValid(str));
    }

    public static boolean isValid(String str) {
        // Write your code here


        int count = 0, i = 0 ,j = 0, dot = 0;

        for (i = 0; i < str.length(); i++) {
            count++;

            if (str.charAt(i) == '.') {
                if (count > 4) return false;

                if (check(str.substring(j, i))) {
                    return false;
                }
                count = 0;
                j = i + 1;
                dot++;
            }
        }

        if (dot == 3)
        {
            if (check(str.substring(j, i))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean check(String str) {
        int num = 0;

        if (str.equals("")) return true;

        int digit = 0;

        for (int i = 0; i < str.length(); i++) {
            num = (num * 10) + (str.charAt(i) - '0');
            digit++;
        }

        if (num != 0 && str.length() != digit) return true;

        if (num >= 0 && num <= 255) {
            return false;
        }
        return true;
    }
}