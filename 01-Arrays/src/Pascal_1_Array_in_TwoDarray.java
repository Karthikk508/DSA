import java.util.Arrays;

public class Pascal_1_Array_in_TwoDarray {


    public static void main(String[] args) {

        pascalTriangle(10);
    }

    public static int[] generateRow(int N,int[] temp) {

        int ans = 1;
        temp[0] = ans;
        for(int i=1; i<N; i++)
        {
            ans = ans * (N-i);
            ans = ans / i;
            temp[i] = ans;
        }
        return temp;
    }
    public static void pascalTriangle(int N) {

         int[][] res = new int[N][];

         for(int i=1; i<=N; i++)
         {
             int[] arr = new int[i];
             res[i-1] = generateRow(i,arr);
         }
        System.out.println(Arrays.deepToString(res));
    }
}
