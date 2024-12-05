public class Qn_3 {


    public static void main(String[] args) {

        find();

    }

    public static void find() {

        String str1 = "2024-11-10";
        String str2 = "2024-11-23";

        int days = 0;

        int year1 = 0 , year2 = 0;

        for (int i = 0; i < 4; i++) {

            year1 = (year1 * 10 ) + str1.charAt(i) - '0';
            year2 = (year2 * 10) + str2.charAt(i) - '0';
        }

        days += (year2 - year1) * 365;

        int month1 = 0 , month2 = 0;

        for (int i = 5; i < 7; i++) {

            month1 = (month1 * 10 ) + str1.charAt(i) - '0';
            month2 = (month2 * 10) + str2.charAt(i) - '0';
        }

        for (int i = month1; i < month2 ; i++) {
            days += month(i);
        }

        int day1 = 0 , day2 = 0;

        for (int i = 8; i < 10; i++) {

            day1  = (day1 * 10 ) + str1.charAt(i) - '0';
            day2 = (day2 * 10) + str2.charAt(i) - '0';
        }

        days += (day2 - day1);

        System.out.println(days);


    }

    public static int month(int num) {
        int days = 0;

        switch (num) {
            case 1:
                days = 31;
                break;
            case 2:
                days = 29;
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
            default:
                break;
        }
        return days;
    }
}

