package SecondRound_2nd_pdfProblems;

public class Equilibrium_index {

    public static void main(String[] args) {


        int[] arr = {1,2,3,4,5,6,7,8};

        System.out.println(equilibriumPoint(arr));



    }

    public static int equilibriumPoint(int[] arr) {
        // code here

        if(arr.length == 1) return arr[0];

        int leftSum = 0 ,totalSum = 0;

        for(int i = 0; i<arr.length; i++)
        {
            totalSum += arr[i];
        }

        int rightSum = totalSum;

        for(int i = 0; i<arr.length; i++)
        {
            if(leftSum == rightSum)
            {
                return i;
            }
            if(i > 0) leftSum += arr[i-1];
            rightSum -= arr[i];
        }

        return -1;
    }
}
