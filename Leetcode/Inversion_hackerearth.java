import java.util.Arrays;

public class Inversion_hackerearth {

    public static void main(String[] args) {

        int ans = 0, index = 0;
        int[] arr = {5,1,9,1,9,6};

        for (int i = 0; i < arr.length; i++) {

            int[] arr1 = new int[arr.length-1];
            int c = 0;
            for (int j = 0; j < arr.length; j++) {

                if(i != j)
                {
                    arr1[c++] = arr[j];
                }
            }
            int inv = 0 ,anti = 0 , sum = 0;
            for (int k = 0; k < arr1.length; k++) {
                for(int l=k+1; l<arr1.length; l++)
                {
                    if( arr1[k] > arr1[l])
                    {
                        inv++;
                    }
                    if( arr1[k] < arr1[l])
                    {
                        anti++;
                    }

                }
            }
            sum = anti+inv;
            if(sum >= ans && i > index)
            {
                ans = sum;
                index = i;
            }
        }
        System.out.println(index+1);
    }
}
