public class Test {

    public static void main(String[] args) {

        int n = 2 % 7;

        System.out.println(n);
        System.out.println(isRev(23));
    }
    public static int isRev(int n)
    {
        int  num = 0;

        while(n>0)
        {
            int digit = n%10;
            num *= 10;
            num += digit;
            n /= 10;
        }
        return num;
    }
}
