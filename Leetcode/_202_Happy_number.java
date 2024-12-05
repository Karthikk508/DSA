public class _202_Happy_number {

    public static void main(String[] args) {

        int n = 19;

        int num = n;
        int sum = 0;
        int val = n;

        while(num > 0) {

            while (num > 0) {
                val = num % 10;
                sum += val * val;
                num = num / 10;
            }
            num = sum;
            if(sum == 1) break;

            sum = 0;
        }


        System.out.println(sum);
    }

}

