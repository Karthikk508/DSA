import java.util.Arrays;

public class Count_bits {
    public static void main(String[] args) {

        int n = 2;

        int[] ans = new int[n+1];

        for(int i = 0; i<=n; i++)
        {
            int k = i;
            int count = 0;
            while(k > 0)
            {
                if((k & 1) == 1)
                {
                    count++;
                }
                k = k>>1;
            }
            ans[i] = count;
        }
        System.out.println(Arrays.toString(ans));
    }
}

