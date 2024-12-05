package Set_7;

public class Remove_duplicates {


    public static void main(String[] args) {


        int[] arr = {1,1,1,2,2,3,4,5,6};

        System.out.println(find(arr));




    }
    public static int find(int[] arr)
    {

        int index = 0, count = 0;

        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i] == arr[i+1])
            {
                count++;
                continue;
            }
            arr[index++] = arr[i];
        }
        arr[index] = arr[arr.length-1];

        return arr.length - count;
    }
}
