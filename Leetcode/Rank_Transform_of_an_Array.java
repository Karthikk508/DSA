import java.util.Arrays;

public class  Rank_Transform_of_an_Array{

    public static void main(String[] args) {

        int[] arr = {37,12,28,9,100,56,80,5,12};
        arrayRankTransform(arr);


    }
    public static int[] arrayRankTransform(int[] arr) {

        int[] arrs = Arrays.copyOfRange(arr, 0, arr.length);
        Arrays.sort(arrs);
        int[] rank = new int[arr.length];

        System.out.println(Arrays.toString(arrs));

        int count = 1 , prev = arrs[0];
        for(int i = 0; i<arrs.length; i++)
        {
            if(arrs[i] != prev)
            {
                count++;
                prev = arrs[i];
            }
            rank[i] = count;
        }

        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 0; j<arrs.length; j++)
            {
                if(arr[i] == arrs[j])
                {
                    arr[i] = rank[j];
                    break;
                }
            }

        }

        System.out.println(Arrays.toString(rank));

        return arr;
    }
}