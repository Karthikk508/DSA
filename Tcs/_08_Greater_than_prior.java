import java.util.Scanner;

public class _08_Greater_than_prior {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;

        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i] > max)
            {
                max = arr[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
