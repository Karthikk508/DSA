public class Num_of_1Bits {
    public static void main(String[] args) {

        long n = 00000000000000000000000010000000;
        System.out.println(hammingWeight(n));



    }
    public static int hammingWeight(long n) {

        int count = 0;
        int l = 0;
        while(n > 0)
        {
            if((n & 1) == 1)
            {
                count++;
            }
            n = n >> 1;
            l++;
        }
        System.out.println(l);
        return count;


    }
}