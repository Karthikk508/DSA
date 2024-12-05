public class Prime_Number_InInterval {
    public static void main(String[] args) {

        prime(1,10);

    }

    public static void prime(int a, int b)
    {
        for (int i = a; i <= b; i++) {

            if (i==0 || i==1)
            {
                continue;
            }
            int flag = 1;

            for (int count = 2; count <= i/2 ; count++) {

                if (i % count == 0) {
                    flag = 0;
                    break;
                }

            }

            if(flag == 1) System.out.println("Prime numbers are " + i);

        }
    }

}
