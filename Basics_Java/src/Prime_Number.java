import java.lang.Math;
public class Prime_Number {
    public static void main(String[] args) {

       boolean k = isPrime(9);

        System.out.println(k);

    }

    static boolean isPrime(int n)
    {
        int i = 2;
        while(i*i<=n)
        {
            if(n%i == 0)
            {
                return false;
            }
            i++;
        }
        return true;

    }
}
