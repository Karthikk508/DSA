public class Qn_4 {


    public static void main(String[] args) {
        find();
    }
    public static void find()
    {

        String startDate = "2024-05-15";

        int y = 2024 , m = 1 , d = 1;

        int days = 70;

        int i =  0;
        int rem = 0;

        while(i < 3)
        {
            if(i == 0)
            {
                int n = days/365;
                rem = days % 365;
                y += n;
            }
            else if(i == 1)
            {
                int n = rem/30;
                rem = rem % 30;
                m += n;
            }
            else {
                d += m;
            }
            i++;
        }
        System.out.println(y + "-" + m + "-" + d);
    }
}
