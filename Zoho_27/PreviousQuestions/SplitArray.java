package PreviousQuestions;

public class SplitArray {

    public static void split(int[] arr){

        int rightSum = 0;

        for (int j : arr) {
            rightSum += j;
        }

        int leftSum = 0 , ind = -1;

        for (int i = 0; i < arr.length; i++) {

            if(leftSum == rightSum) ind = i;

            leftSum += arr[i];
            rightSum -= arr[i];
        }

        if(ind == -1) {System.out.println("Not possible"); return;}

        for (int i = 0; i < ind; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = ind; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
        }

    }


    public static void main(String[] args) {


        int[] arr = {4,3,2,1};

        split(arr);



    }
}
