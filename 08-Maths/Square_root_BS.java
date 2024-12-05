public class Square_root_BS {

    public static void main(String[] args) {

        System.out.println(sqrt(80 , 15));

    }
    public static double sqrt(int n , int p)
    {
        double root = 0.0;
        int start = 0 ,end = n;
        while(start<=end)
        {
            int mid = (start + (end-start)/2);

            if(mid * mid > n)
            {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        root = end;

        double incr = 0.1;
        int count = 0 ,count1 = 0;
        for(int i = 0; i<p; i++)
        {
            while(root*root <= n)
            {
                root += incr;
                count++;
            }
            count1++;
            root -= incr;
            incr /= 10;
        }
        System.out.println(count1);
        System.out.println(count);
        return root;
    }
}
