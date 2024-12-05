package Round_2;

public class _1_Window {

    public static void main(String[] args) {


        int[] arr = {19 ,0 ,30 ,40 ,6,2, 7, 7, 80, 95, 66, 13, 95, 52, 78 ,66, 99, 24, 28, 20, 11, 57, 10 ,8 ,17 ,68 ,59, 19, 75, 13, 11 ,34, 84 ,72, 74, 31, 43, 30, 98, 0 ,68, 28 ,75};
        int w = 39;

        print(w,arr);


    }
    public static void print(int w,int[] arr)
    {

        for (int i = 0; i <= arr.length - w; i++) {

            int max = arr[i];

            int count = 0;

            for (int j = i+1; count < w-1; j++, count++) {

                if(arr[j] > max)
                {
                    max = arr[j];
                }
            }
            System.out.print(max + " ");
        }

    }
}
