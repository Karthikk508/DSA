package SecondRound_2nd_pdfProblems;

import java.util.Arrays;

public class Qn_17 {


    /// find the max value for each integer

    public static void main(String[] args) {

        int[] arr = {120,24,71,10,59};

        for (int i = 0; i < arr.length; i++) {
            int max = findDigitAddition(arr[i]);
            if(max < findDigitMultiply(arr[i]))
            {
                max = findDigitMultiply(arr[i]);
            }
            arr[i] = max;
        }

        System.out.println(Arrays.toString(arr));

    }

    public static int findDigitMultiply(int n)
    {
        int sum = 1;
        while(n > 0)
        {
            sum *= (n%10);
            n /= 10;
        }
        return sum;
    }
    public static int findDigitAddition(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }

}
