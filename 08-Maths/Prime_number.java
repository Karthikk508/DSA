public class Prime_number {

    public static void main(String[] args) {

        boolean k = isPrime(9);

        System.out.println(k);

    }

    static boolean isPrime(int n)
    {
        int i=2;
        while(i*i<=n)         // i  <= Square_root(n)  ==  i * i <= n
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
