public class Count_primes_InRange {

    public static void main(String[] args) {

        System.out.println(countPrimes(40));
    }
    public static int countPrimes(int n) {

        boolean[] prime = new boolean[n+1];

        for(int i = 2; i*i<=n; i++)
        {
            if(!prime[i])
            {
                for(int j = i+i; j<=n; j+=i)
                {
                    prime[j] = true;
                }
            }
        }


        int count = 0;
        for(int i = 2; i<n; i++)
        {
            if(!prime[i])
            {
                count++;
            }
        }
        return count;
    }
}

