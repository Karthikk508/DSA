public class Arranging_Coins {

    public static void main(String[] args) {

        int n=5;
        int sum = 0;
        int itr = 0;
        int osum = 0;

        for(int i=0; i<n; i++)
        {
            sum += i;
            itr = i;
            if(sum >= n) break;
        }

        for(int j=0; j<=itr; j++)
        {
            osum += j;
        }

        System.out.println(itr-1);
        System.out.println(osum);

    }
}
