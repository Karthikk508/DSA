package Round_2;

public class _4_Threshold_value {


    public static void main(String[] args) {

        int[] arr = {67,743,73,634,89,734,9,76,90,36,65,34};

        findCount(12,arr);


    }
    public static void findCount(int t,int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            int div = arr[i] / t;
            sum += div;
            sum += (arr[i] % t == 0) ? 0 : 1;

        }

        System.out.println(sum);
    }
}
