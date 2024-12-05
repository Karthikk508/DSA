public class Sum_of_n_natural_numbrs {

    public static void main(String[] args) {

        int n=10;
        int start = 0;
        int end = n/2;
        int ans = 0;


        while(start<end)
        {

            int sum = 0;
            int mid = start + (end-start)/2;
            sum = (mid*(mid+1))/2;

            System.out.println(sum);

            if(n == sum)
            {
                System.out.println(mid);
            }
            else if(n>sum)
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }

        }

        //System.out.println(mid);
    }
}

