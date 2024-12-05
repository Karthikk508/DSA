package PreviousQuestions;

import java.util.Arrays;

public class SortOddAndEven {


    public static void find(int[] arr){

        Arrays.sort(arr);

        int count = 0;

        for(int i = arr.length-1; i>=0; i--){

            if(arr[i] % 2 != 0){
                int j = i;

                while(j > count){

                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    j--;
                }
                count++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }



    public static void main(String[] args) {



        int[] arr = {1,2,3,4,5,6,7,8,9};

        find(arr);

    }
}
