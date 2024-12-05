package Subarray;

public class Subarray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4};

        generateSubArray(0,0,arr);



    }
    public static void generateSubArray(int i ,int j ,int[] arr)
    {

        if(i == arr.length-1)
        {
            return;
        }

        if(j == arr.length-1)
        {
            i+=1;
            j =i;
        }

        if(j < arr.length - 1)
        {
            System.out.print(arr[j] + " ");
            generateSubArray(i,j+1,arr);
        }
    }



}
