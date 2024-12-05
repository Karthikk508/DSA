public class Setbits {

    public static void main(String[] args) {

        int n = 6;
        int count = 0;

        while(n>0)
        {
            count++;
            n -= (n & -n);
        }
        System.out.println(count);

        /// Method two

        int x = 16;
        int cnt = 0;

        while(x > 0)
        {
            cnt++;
            x = x & (x-1);
        }
        System.out.println(cnt);

    }

}
