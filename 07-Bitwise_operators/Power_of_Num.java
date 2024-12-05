public class Power_of_Num {
    public static void main(String[] args) {

        int power = 4;
        int base = 2;

        int ans = 1;

        while(power>0)
        {
            if((power & 1) == 1)
            {
                ans *= base;
            }
            base *= base;
            power = power >> 1;
        }
        System.out.println(ans);
    }

}
