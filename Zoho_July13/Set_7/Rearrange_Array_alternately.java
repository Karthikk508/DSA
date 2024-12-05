package Set_7;

public class Rearrange_Array_alternately {


    public static void main(String[] args) {


        long[] arr = {2,4,6,10,15,16,18,19};

        rearrange(arr,8);




    }
    public static void rearrange(long[] arr, int n){

        long max = arr[n-1] + 1;
        int j = n-1;

        for(int i = 0; i<n; i+=2)
        {
            arr[i] = arr[i] + (arr[j] % max) * max;
            j--;
        }
        j = 0;
        for(int i = 1; i<n; i+=2)
        {
            arr[i] = arr[i] + (arr[j] % max) * max;
            j++;
        }
        for(int i = 0; i<n; i++)
        {
            arr[i] /= max;
        }
    }
}
