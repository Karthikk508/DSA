import java.util.Arrays;

public class Pascal {

    public static void main(String[] args)
    {
        pascalTriangle(5);
    }

    public static int[] row(int n, int[] temp){

        int ans=1;

        temp[0]=1;

        for(int i=1;i<n;i++){

            ans=ans*(n-i);

            ans=ans/i;

            temp[i]=ans;

        }
        return temp;
    }
    public static void pascalTriangle(int N) {

        int[][] res = new int[N][];

        for(int i=1;i<=N;i++){

            int[] temp =new int[i];

            res[i-1]=row(i,temp);
        }
        System.out.println(Arrays.deepToString(res));

    }
}